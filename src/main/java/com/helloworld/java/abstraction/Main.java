package com.helloworld.java.abstraction;

import com.helloworld.java.constructor.Employe;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10,"chandu","candu@gmail.com","123",(byte)30);

        Mysqlconnet mysqlconnet = new Mysqlconnet();
        CustomerImpl customer = new CustomerImpl(mysqlconnet);
        customer.saveCustomerDataintoDb(customer1);
        customer.displayEmployeDetails(customer1);

        PostgreSQL postgreSQL = new PostgreSQL();
        CustomerImpl customerpost = new CustomerImpl(postgreSQL);
        customerpost.saveCustomerDataintoDb(customer1);
        customerpost.displayEmployeDetails(customer1);
    }
}
