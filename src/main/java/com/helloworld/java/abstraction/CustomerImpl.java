package com.helloworld.java.abstraction;

public class CustomerImpl extends CustomerService {

    Repositry repositry;

    public CustomerImpl(Repositry repositry) {
        this.repositry = repositry;
    }

    @Override
    void saveCustomerDataintoDb(Customer customer) {
        repositry.connectDb();
        repositry.saveCustomerdata(customer);
    }
}
