package org.example;

public class WhileLoop {
//do not change class name here, do refactor and rename
    public static void main(String[] args) {
        // repeat that line 100 times
        System.out.println("Let's play with loops");
        // repeat some instruction as many times as we wish
        // java has got 3 types of loops: while,

        // while loop is going to be executed as long as condition is true
        //       while (true) {
        //           System.out.println("Let's play with loops");

        //       }

        int numberOfRepetitions = 10;
        while (numberOfRepetitions > 0) {
            System.out.println("Loop is running, number of repetitions is: " + numberOfRepetitions);
            // text--; is decrease by one; same as numberOfRepetitions = numberOfRepetitions - 1;
            numberOfRepetitions--;
            // numberOfRepetitions-=2; if decrease by 2 or more; same as numberOfRepetitions = numberOfRepetitions - 2;

        }
        System.out.println("After loop");
        System.out.println("Number of repetitions is: " + numberOfRepetitions);
    }
}
