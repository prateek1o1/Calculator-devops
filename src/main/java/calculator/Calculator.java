package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){
    }
    public static void main(String[] args)
    {
        Calculator object=new Calculator();
        Scanner scan=new Scanner(System.in);

        double input1,input2;
        do{
            System.out.println("Hello There! What a nice day to learn about devops pipeline through this mini-project.\nEnter your choice-");
            System.out.print("""
                    Press 1 to find Square Root
                    Press 2 to find Factorial
                    Press 3 to find Natural Logarithm
                    Press 4 to find Power
                    Press 5 to exit
                    Enter your choice:\s""");

            int key;
            try{
                key= scan.nextInt();
            }
            catch(InputMismatchException err){
                return;
            }

            switch (key) {
                case 1 -> {
                    //Square Root
                    System.out.print("Give your input-");
                    input1 = scan.nextDouble();
                    System.out.println("Square Root of " + input1 + " is : " + object.squareroot(input1));
                    System.out.println("\n");
                }
                case 2 -> {
                    //Factorial Function
                    System.out.print("Give your input-");
                    input1 = scan.nextDouble();
                    System.out.println("Factorial of " + input1 + " is : " + object.factorial(input1));
                    System.out.println("\n");
                }
                case 3 -> {
                    //Natural Logarithm
                    System.out.print("Give your input-");
                    input1 = scan.nextDouble();
                    System.out.println("Natural Logarithm of " + input1 + " is : " + object.logarithm(input1));
                    System.out.println("\n");
                }
                case 4 -> {
                    //Power Function
                    System.out.print("Give your first input-");
                    input1 = scan.nextDouble();
                    System.out.print("Give your second input-");
                    input2 = scan.nextDouble();
                    System.out.println(" " + input1 + " to the power of " + input2 + " is : " + object.power(input1, input2));
                    System.out.println("\n");
                }
                default -> {
                    System.out.println("Signing off!");
                    return;
                }
            }
        }while (true);
    }
    public double squareroot(double input1) {
        logger.info("[SQUARE ROOT] - " + input1);
        double result = Math.sqrt(input1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
    public Double factorial(double input1) {
        logger.info("[FACTORIAL] - " + input1);
        double result = 1.0;
        for (int i = 2; i <= input1; i++)
            result = result*i;

        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double logarithm(double input1) {
        logger.info("[LOGARITHM] - " + input1);
        double result = Math.log(input1);
        logger.info("[RESULT - LOGARITHM] - " + result);
        return result;
    }
    public double power(double input1,double input2) {
        logger.info("[POWER] - " + input1);
        double result = Math.pow(input1,input2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }


}
