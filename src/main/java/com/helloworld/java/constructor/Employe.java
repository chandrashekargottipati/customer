package com.helloworld.java.constructor;

public class Employe {
    int id;
    String name;

    String email;
    String password;
    byte age;


    Employe() {
        System.out.println("constructor call ");
    }

    Employe(int id, String name, String email, String password, byte age) {
        this.id = this.id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        config();
    }

    void config(){
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
