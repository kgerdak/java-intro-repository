package org.example;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Using my homework calculator");
    }
    public int add(int a, int b) {
        System.out.println("Received parameters, a = " + a + ", b = " + b);
        int result = a + b;
        System.out.println("Calculation result is: " + result);
        return result;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}