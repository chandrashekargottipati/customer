package com.helloworld.java.constructor;

public class Employe {
    int id;
    String name;
    String email;
    String password;
    byte age;

    final static String COMP = "apple";

    Employe() {
        System.out.println("constructor call ");
    }

    Employe(int i, String name, String email, String password, byte age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    void config() {
        System.out.println("called config method");
    }


    void displayEmployeDetails() {
        System.out.println("Id " + id);
        System.out.println("Name " + name);
        System.out.println("Email " + email);
        System.out.println("Password " + password);
        System.out.println("age " + age);

    }


}
