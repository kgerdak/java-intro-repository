package org.example;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuessGame {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the random number between 1 and 25");
        int num1 = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;  // Generates a random integer between 1 and 25
        System.out.println("Random number: " + randomNumber);

        String result;
        if (num1 == randomNumber) {
            result = "Correct!";
        } else {
            result = "Incorrect!";
        }
        System.out.println(result);
    }
}
