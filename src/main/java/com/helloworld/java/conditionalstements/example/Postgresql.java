package com.helloworld.java.conditionalstements.example;

public class Postgresql extends Repositery {

    @Override
    void connectdb() {
        System.out.println("connect postgres");
    }

    @Override
    void addcustomertodb(Customer customer) {
        System.out.println("add custome data in postgres");
    }
}
