import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator(1,2);
        assertEquals(3, calculator.add());
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator(7,5);
        assertEquals(2, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator(2,3);
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void canDivide(){
        Calculator calculator = new Calculator(10,2);
        assertEquals(5, calculator.divide());
    }


}
