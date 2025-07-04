package com.example;

/**
 * The {@code Main} class is the entry point for running the Greeter example.
 */
public class Main {

    /**
     * The main method that runs the Greeter.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("World"));
    }
}
