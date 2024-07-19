package com.helloworld.java.constructor;

public class ConstructorOverloadingExample {
    private int number;
    private String text;

    // Default constructor
    public ConstructorOverloadingExample() {
        number = 0;
        text = "Default Text";
    }

    // Parameterized constructor with one parameter
    public ConstructorOverloadingExample(int number) {
        this.number = number;
        this.text = "Default Text";
    }

    // Parameterized constructor with two parameters
    public ConstructorOverloadingExample(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        // Using default constructor
        ConstructorOverloadingExample example1 = new ConstructorOverloadingExample();
        example1.display();

        // Using parameterized constructor with one parameter
        ConstructorOverloadingExample example2 = new ConstructorOverloadingExample(10);
        example2.display();

        // Using parameterized constructor with two parameters
        ConstructorOverloadingExample example3 = new ConstructorOverloadingExample(20, "Hello");
        example3.display();
    }
}
