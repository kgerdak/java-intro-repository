package org.example;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Now - let's play with for loop");

        for (
                int numberOfRepetitions = 10;
                // variable initialisation - executed only once
                numberOfRepetitions > 0;
                // loop condition
                numberOfRepetitions--
                // executed at the end of iteration
        ) {
            System.out.println("Loop is running, number of repetitions is: " + numberOfRepetitions);
        }
        // numberOfRepetitions is not available outside of the loop
    }
}
