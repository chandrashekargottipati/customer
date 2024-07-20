package com.helloworld.java.abstraction;

public abstract class  CustomerService {
  abstract void saveCustomerDataintoDb(Customer customer);

    void displayEmployeDetails(Customer customer) {
        System.out.println("Id " + customer.id);
        System.out.println("Name " + customer.name);
        System.out.println("Email " + customer.email);
        System.out.println("Password " + customer.password);
        System.out.println("age " + customer.age);

    }
}
