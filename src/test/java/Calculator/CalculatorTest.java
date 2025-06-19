package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(8, calc.add(5, 3));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calc.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(5, 0);
    }
}
