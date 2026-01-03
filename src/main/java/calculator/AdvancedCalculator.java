package main.java.calculator;

public class AdvancedCalculator extends Calculator {

    public int absNumber(int a) {
        return Math.abs(a);
    }

    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль при вычислении остатка");
        }
        return a % b;
    }

    public double sinDegrees(int degrees) {
        double radians = degrees * Math.PI / 180;
        return Math.sin(radians);
    }

    public double hypotNumber(double a, double b) {
        return Math.hypot(a, b);
    }
}
