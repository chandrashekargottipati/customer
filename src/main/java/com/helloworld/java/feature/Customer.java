package com.helloworld.java.feature;

public class Customer {
    int id;
    String name;
    String email;
    String password;
    byte age;

    public Customer() {
        System.out.println("customer constructor......");
    }

    public Customer(String name, String email, String password, int id,byte age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
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
