package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins";
    //private static final String MESSAGE = "dummy string";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Test github webhook!");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
