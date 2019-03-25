import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before

    public void before() {
        this.calculator = new Calculator(1, 5);
    }

    @Test
    public void canAdd() {
        assertEquals(6, calculator.add(), 0.001);

    }

    @Test
    public void canSubtract() {
        assertEquals(-4, calculator.subtract(), 0.001);
    }

    @Test
    public void canMultiply() {
        assertEquals(5, calculator.multiply(), 0.001);
    }

    @Test
    public void canDivide() {
        assertEquals(0.2, calculator.divide(),0.001);
    }
}