package org.example;

public class MyFirstJavaMethod {
    public static void main(String[] args) {
        // function has got name: main
        // function needs some input parameters - located inside braces example String() args
        // return type (result) - example void - at the beginning of the method signature
        // void means no results, no reason

        // call method using its name
        describeMe();
        System.out.println("one");
        describeMe();
        System.out.println("two");
        describeMe();
    }

    public static void describeMe() {
        System.out.println("Hi' I'm Gerda");
        System.out.println("I'm learning Java for the first time :)");
    }
}
