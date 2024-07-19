package com.helloworld.java.conditionalstements.java8feature;

public class Greeting implements Greet{
    @Override
    public void greet() {
        System.out.println("Hello");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
