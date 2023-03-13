import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestingCalculator {
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
}
