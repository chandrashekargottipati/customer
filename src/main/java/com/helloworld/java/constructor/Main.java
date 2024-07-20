package com.helloworld.java.constructor;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe();
        employe.displayEmployeDetails();
        Employe employe1 = new Employe(10,"chandu","candu@gmail.com","123",(byte)30);
        employe1.displayEmployeDetails();
        System.out.println(Employe.COMP);
//        System.out.println(employe1.COMP);
    }
}
