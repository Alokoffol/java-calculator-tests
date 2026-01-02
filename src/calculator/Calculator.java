package calculator;

public class Calculator {

    public int sumNumber(int a, int b) {
        return a + b;
    }

    public int subNumber(int a, int b) {
        return a - b;
    }

    public int multiNumber(int a, int b) {
        return a * b;
    }

    public double divNumber(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return (double) a / b;
    }

    public double powNumber(int a, int b) {
        return Math.pow(a, b);
    }

    public double sqrtNumber(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Корень из отрицательного числа невозможен");
        }
        return Math.sqrt(a);
    }
}
