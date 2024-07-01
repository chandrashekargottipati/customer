package org.example;

public class CustomerServiceImpl extends CustomerService{
    Repositery repositery;

    public CustomerServiceImpl(Repositery repositery){
        this.repositery = repositery;
    }
    @Override
    void addCustomertodb(Customer customer) {
        repositery.connectdb();
        repositery.addcustomertodb(customer);
    }
}
