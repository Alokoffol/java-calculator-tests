package calculator;

import main.java.calculator.Calculator;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void sumNumber_twoPositiveNumbers_returnSum() {
        int a = 5;
        int b = 3;
        int expected = 8;

        int result = calc.sumNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void sumNumber_NegativeAndPositiveNumbers_returnSum() {
        int a = -5;
        int b = 3;
        int expected = -2;

        int result = calc.sumNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void subNumber_twoPositiveNumbers_returnSub() {
        int a = 7;
        int b = 4;
        int expected = 3;

        int result = calc.subNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void subNumber_NegativeAndPositiveNumbers_returnSub() {
        int a = -7;
        int b = 4;
        int expected = -11;

        int result = calc.subNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void multiNumber_twoPositiveNumbers_returnMulti() {
        int a = 2;
        int b = 8;
        int expected = 16;

        int result = calc.multiNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void multiNumber_NegativeAndPositiveNumbers_returnMulti() {
        int a = -2;
        int b = 8;
        int expected = -16;

        int result = calc.multiNumber(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void divNumber_twoPositiveNumbers_returnDiv() {
        int a = 9;
        int b = 2;
        double expected = 4.5;

        double result = calc.divNumber(a, b);

        assertEquals(expected, result, 0.001);
    }

    @Test
    public void divNumber_NegativeAndPositiveNumbers_returnDiv() {
        int a = 9;
        int b = -2;
        double expected = -4.5;

        double result = calc.divNumber(a, b);

        assertEquals(expected, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void divNumber_DivisionByZero_returnError() {
        calc.divNumber(4, 0);
    }

    @Test
    public void powNumber_twoPositiveNumbers_returnPow() {
        int a = 2;
        int b = 3;
        double expected = 8.0;

        double result = calc.powNumber(a, b);

        assertEquals(expected, result, 0.001);
    }

    @Test
    public void sqrtNumber_positiveNumbers_returnSqrt() {
        int a = 25;
        double expected = 5.0;

        double result = calc.sqrtNumber(a);

        assertEquals(expected, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrtNumber_negativeNumbers_returnError() {
        calc.sqrtNumber(-4);
    }

}
