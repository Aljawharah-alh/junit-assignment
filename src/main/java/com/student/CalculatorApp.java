package com.student;

public class CalculatorApp {

    private Operation calculator = new BasicCalculator();

    public int performAdd(int a, int b) {
        return calculator.add(a, b);
    }

    public int performSubtract(int a, int b) {
        return calculator.subtract(a, b);
    }

    public boolean checkPositive(int number) {
        return calculator.isPositive(number);
    }

    public String getMessage() {
        return calculator.welcomeMessage();
    }

    public static void main(String[] args) {

        CalculatorApp app = new CalculatorApp();

        System.out.println("2 + 3 = " + app.performAdd(2, 3));
        System.out.println("10 - 4 = " + app.performSubtract(10, 4));
        System.out.println("Is 5 positive? " + app.checkPositive(5));
        System.out.println(app.getMessage());
    }
}