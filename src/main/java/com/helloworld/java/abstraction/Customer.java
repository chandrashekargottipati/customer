package com.helloworld.java.abstraction;

public class Customer {
    int id;
    String name;
    String email;
    String password;
    byte age;


    Customer() {
        System.out.println("constructor call ");
    }

    Customer(int id, String name, String email, String password, byte age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    void displayEmployeDetails() {
        System.out.println("Id " + id);
        System.out.println("Name " + name);
        System.out.println("Email " + email);
        System.out.println("Password " + password);
        System.out.println("age " + age);

    }
}
