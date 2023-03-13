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
            System.out.print("Press 1 to find Square Root\n" +
                    "Press 2 to find Factorial \n" +
                    "Press 3 to find Natural Logarithm \n" +
                    "Press 4 to find Power \n" +
                    "Press 5 to exit \n" +
                    "Enter your choice:");
            int key;
            try{
                key= scan.nextInt();
            }
            catch(InputMismatchException err){
                return;
            }
            switch (key){
                case 1:
                    System.out.print("Give your input-");
                    input1 = scan.nextDouble();
                    System.out.println("Square Root of " + input1 + " is : " + object.squareroot(input1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Signing Off!");
                    return;
            }
        }while(true);
    }
    public double squareroot(double input1) {
        logger.info("[SQUARE ROOT] - " + input1);
        double result = Math.sqrt(input1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }
}
