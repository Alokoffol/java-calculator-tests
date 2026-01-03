package calculator;

import main.java.calculator.AdvancedCalculator;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AdvancedCalculatorTest {

    private AdvancedCalculator calc;

    @Before
    public void setUp() {
        calc = new AdvancedCalculator();
    }

    @Test
    public void absNumber_positive_returnsSame() {
        assertEquals(5, calc.absNumber(5));
    }

    @Test
    public void absNumber_negative_returnsPositive() {
        assertEquals(5, calc.absNumber(-5));
    }

    @Test
    public void mod_normalCase_returnsRemainder() {
        assertEquals(2, calc.mod(17, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void mod_divisionByZero_throwsException() {
        calc.mod(10, 0);
    }

    @Test
    public void sinDegrees_90degrees_returns1() {
        assertEquals(1.0, calc.sinDegrees(90), 0.0001);
    }

    @Test
    public void hypotNumber_3and4_returns5() {
        assertEquals(5.0, calc.hypotNumber(3, 4), 0.001);
    }
}