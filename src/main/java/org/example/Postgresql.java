package org.example;

public class Postgresql implements Repositery{
    @Override
    public void connectdb() {
        System.out.println("Connect : postgresql");
    }

    @Override
    public void addcustomertodb(Customer customer) {
        System.out.println("Add custome data into Postgresql");
    }
}
