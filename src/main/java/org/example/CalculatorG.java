package org.example;

import java.util.Scanner;

public class CalculatorG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation (+ or * or / or -): ");
        String operation = scanner.next();

        int result;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("The result is: " + result);
    }
}
