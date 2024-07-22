package com.helloworld.java.encapsulation.p2;

import com.helloworld.java.encapsulation.p1.A;

public class X {
    public static void main(String[] args) {
        A a;// out of package class import
        a = new A();
        System.out.println(a.variable);

    }
}
