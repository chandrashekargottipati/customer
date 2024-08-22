package com.helloworld.java.jav8feature;

public class Greetimpl implements Greet{

    @Override
    public void greet() {
        System.out.println("hello from no argment method");
    }

    @Override
    public void greet(String msg) {
        System.out.println("from argument method"+msg);
    }





}

