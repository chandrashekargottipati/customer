package com.helloworld.java.encapsulation.p1;

public class A {
    public int variable = 7;
    protected  int password = 132;

    public static void main(String[] args) {

        A a;
        a = new A();
        System.out.println(a.variable);

    }
}
