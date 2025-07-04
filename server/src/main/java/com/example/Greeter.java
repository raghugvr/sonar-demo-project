package com.example;

/**
 * The {@code Greeter} class provides a method to greet someone by name.
 */
public class Greeter {

    /**
     * Constructs a {@code Greeter}.
     */
    public Greeter() {
        // Default constructor
    }

    /**
     * Returns a greeting message for the specified person.
     *
     * @param someone the name of the person to greet
     * @return a greeting string
     */
    public String greet(String someone) {
        return String.format("Hello, %s!", someone);
    }
}
