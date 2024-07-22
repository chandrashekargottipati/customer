package com.helloworld.java.encapsulation.p2;

import com.helloworld.java.encapsulation.p1.A;

public class Y extends A {
    public static void main(String[] args) {

//        A a;   we cant acces default variable and methods with parent class
//        a = new A();
        Y y;
        y = new Y();

        System.out.println(y.password);

    }
}
