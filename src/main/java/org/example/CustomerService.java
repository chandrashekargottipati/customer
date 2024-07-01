package org.example;

public abstract class CustomerService {

    abstract void addCustomertodb(Customer customer);

    void displaycustomerdata(Customer customer){
        System.out.println("Name : "+customer.getName());
        System.out.println("Customerid : "+customer.getCustomerId());
        System.out.println("Email : "+customer.getEmail());

    }

}
