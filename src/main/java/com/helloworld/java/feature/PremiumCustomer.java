package com.helloworld.java.feature;

public class PremiumCustomer extends Customer{
    String membershipType;


     PremiumCustomer() {
        System.out.println("premium cutomr constructor..");
    }

    public PremiumCustomer(String name, String email, String password, int id, byte age, String membershipType) {
        super(name, email, password, id, age);
        this.membershipType = membershipType;
    }

    @Override
    void displayEmployeDetails() {
        super.displayEmployeDetails();
    }
}
