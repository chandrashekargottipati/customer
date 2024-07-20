package com.helloworld.java.abstraction;

public class PostgreSQL extends Repositry{
    @Override
    void connectDb() {
        System.out.println("connect postgres");
    }

    @Override
    void saveCustomerdata(Customer customer) {
        System.out.println("save customer data into postgre");
    }
}
