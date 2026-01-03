package calculator;

import main.java.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {

    private int a;
    private int b;
    private int expectedSum;
    private int expectedSub;
    private int expectedMulti;
    private double expectedDiv;
    private double expectedPow;
    private double expectedSqrt;

    public CalculatorParameterizedTest(
            int a,
            int b,
            int expectedSum,
            int expectedSub,
            int expectedMulti,
            double expectedDiv,
            double expectedPow,
            double expectedSqrt
    ) {
        this.a = a;
        this.b = b;
        this.expectedSum = expectedSum;
        this.expectedSub = expectedSub;
        this.expectedMulti = expectedMulti;
        this.expectedDiv = expectedDiv;
        this.expectedPow = expectedPow;
        this.expectedSqrt = expectedSqrt;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {5, 3, 8, 2, 15, 1.666, 125.0, 2.236},
                {10, 2, 12, 8, 20, 5.0, 100.0, 3.162},     // всё ок
                {9, 3, 12, 6, 27, 3.0, 729.0, 3.0},
        });
    }

    @Test
    public void testAllOperations() {
        Calculator calc = new Calculator();

        assertEquals(expectedSum, calc.sumNumber(a, b));
        assertEquals(expectedSub, calc.subNumber(a, b));
        assertEquals(expectedMulti, calc.multiNumber(a, b));
        assertEquals(expectedDiv, calc.divNumber(a, b), 0.001);
        assertEquals(expectedPow, calc.powNumber(a, b), 0.001);
        assertEquals(expectedSqrt, calc.sqrtNumber(a), 0.001); // Без проверки NaN!
    }
}
