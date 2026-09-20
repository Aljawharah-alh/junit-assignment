package com.student;

public class BasicCalculator implements Operation {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public boolean isPositive(int number) {
        return number > 0;
    }

    @Override
    public String welcomeMessage() {
        return "Hello JUnit";
    }
}