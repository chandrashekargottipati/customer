package com.helloworld.java.feature;

public class RegularCustomer extends Customer{
    int cashbackPoints;

    RegularCustomer(){
        System.out.println("regular constrocor...");
    }

    public RegularCustomer(String name, String email, String password, int id, byte age, int cashbackPoints) {
        super(name, email, password, id, age);
        this.cashbackPoints = cashbackPoints;
    }

    @Override
    void displayEmployeDetails() {
        super.displayEmployeDetails();
        System.out.println("Regular cusomer cashpoints "+cashbackPoints);
    }
}
