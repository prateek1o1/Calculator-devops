import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Check {
    private static final double DELTA=1e-20;
    Calculator object=new Calculator();

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding squareroot for True Positive", 4, object.squareroot(16), DELTA);
        assertEquals("Finding squareroot for True Positive", 6, object.squareroot(36), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding squareroot for False Positive", 19, object.squareroot(400), DELTA);
        assertNotEquals("Finding squareroot for False Positive", 7, object.squareroot(64), DELTA);
    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive", 120, object.factorial(5), DELTA);
        assertEquals("Finding factorial for True Positive", 5040, object.factorial(7), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for False Positive", 7, object.factorial(3), DELTA);
        assertNotEquals("Finding factorial for False Positive", 21, object.factorial(4), DELTA);
    }

    @Test
    public void logarithmTruePositive(){
        assertEquals("Finding logarithm for True Positive", 1.60943791243, object.logarithm(5), DELTA);
        assertEquals("Finding logarithm for True Positive", 2.30258509299, object.logarithm(10), DELTA);
    }

    @Test
    public void logarithmFalsePositive(){
        assertNotEquals("Finding logarithm for False Positive", 4, object.logarithm(25), DELTA);
        assertNotEquals("Finding logarithm for False Positive", 3, object.logarithm(35), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding squareroot for True Positive", 256, object.power(16,2), DELTA);
        assertEquals("Finding squareroot for True Positive", 1728, object.power(12,3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding squareroot for False Positive", 37, object.power(6,2), DELTA);
        assertNotEquals("Finding squareroot for False Positive", 63, object.power(4,3), DELTA);
    }
}
