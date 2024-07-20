package com.helloworld.java.abstraction;

public class Mysqlconnet extends Repositry {


    @Override
    void connectDb() {
        System.out.println("connect mysql");
    }

    @Override
    void saveCustomerdata(Customer customer) {
        System.out.println("add data into mysql");
    }
}
