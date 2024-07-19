package com.helloworld.java.foodie.repository;

import com.helloworld.java.foodie.model.Customermodel;
import com.helloworld.java.foodie.util.Factory;

import java.util.List;
import java.util.Optional;

public class CustomerRepo {
    private List<Customermodel> customermodelList;

    public CustomerRepo() {
        this.customermodelList = Factory.getCsv().readcustomerfromcsv();
    }

    public List<Customermodel> getCustomermodelList() {
        return customermodelList;
    }

    public Customermodel save(Customermodel customermodel){
        this.customermodelList.add(customermodel);
        return customermodel;
    }

    public Optional<Customermodel> getcustomerbyid(String id){
        return this.customermodelList.stream().filter(customermodel -> customermodel.getId().equals(id)).findFirst();
    }
}