package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "john.doe@example.com");
//        Mysqlconnectdb repositry = new Mysqlconnectdb();
        Postgresql postgresql = new Postgresql();
//        CustomerService customerService = new CustomerServiceImpl(repositry);
        CustomerService customerService = new CustomerServiceImpl(postgresql);

        customerService.addCustomertodb(customer);
        customerService.displaycustomerdata(customer);

    }
}