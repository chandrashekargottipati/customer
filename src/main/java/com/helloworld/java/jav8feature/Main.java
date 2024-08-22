package com.helloworld.java.jav8feature;

public class Main {
    public static void main(String[] args) {
        Greetimpl greetimpl = new Greetimpl();
        greetimpl.greet();
        greetimpl.greet("Hi this is from argemtn");
        Greet greetobj = new Greet() {
            @Override
            public void greet() {
                System.out.println("Hello this is for no arg");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };

        greetobj.greet();
        greetobj.greet("hello this is from greetobj arg method");


        //functional interface
        Hello hello = (msg) -> System.out.println(msg);
        hello.sayHello("hi how are you");
    }


}
