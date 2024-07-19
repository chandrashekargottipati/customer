package com.helloworld.java.conditionalstements.example;

public class Mysqlconnectdb extends Repositery{
    @Override
    void connectdb() {
        System.out.println("connect mysql database");
    }

    @Override
    void addcustomertodb(Customer customer) {
        System.out.println("added customer data into mysql");
    }
}
