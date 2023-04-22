package org.example;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's play with objects");

        Person gerda = new Person();
        Person birgit = new Person();
        birgit.name = "birgit";

        System.out.println("gerda name is: " + gerda.name);
        gerda.name = "gerda";
        gerda.surname = "kalda";
        gerda.age = 25;

        System.out.println("Object after assigning some values");
        System.out.println("gerda name is " + gerda.name);
        System.out.println("birgit name is " + birgit.name);

        String person1Name;
        String person1Surname;
        int person1age;
    }
}
