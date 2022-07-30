package main.java.exercises;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Human has " + Person.N_EYES + " eyes.");
    }
}

class Person {
    public static int N_EYES = 2;
}