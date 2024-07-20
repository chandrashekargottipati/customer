package com.helloworld.java.feature;

import com.helloworld.java.constructor.Employe;

public class Main {
    public static void main(String[] args) {
      /* Customer customer = new Customer();
       Customer customer = new Customer("chandu","chandu@gmail.com","1234567",1, (byte) 30);
        customer.displayEmployeDetails();

        PremiumCustomer premiumCustomer = new PremiumCustomer("prem","prem@gamil.com","123456",1, (byte) 30,"Gold");
        RegularCustomer regularCustomer = new RegularCustomer("ravi","ravi@gmail.com","123789",2,(byte) 31,875);
       premiumCustomer.displayEmployeDetails();
       regularCustomer.displayEmployeDetails();

        premiumCustomer.displayEmployeDetails();
        regularCustomer.displayEmployeDetails();*/

//        Laptop laptop = new Laptop();
//        laptop.displayIinfo();

        Phone product = new Phone();
        product.display();
        product.displayInfo();
        product.show();

    }
}
