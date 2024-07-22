package com.helloworld.java.encapsulation.p1;

public class C extends A{
    public int variable = 3;
    public static void main(String[] args) {
        A a;// public class acces any class in same package
        C c = new C();
        a = new A();
        System.out.println(a.variable);
        System.out.println("c value "+c.variable);
    }
}
