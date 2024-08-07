package com.helloworld.java.foodie.service;

import com.helloworld.java.foodie.exception.CustomerExistsException;
import com.helloworld.java.foodie.model.Customermodel;
import com.helloworld.java.foodie.repository.CustomerRepo;

import java.util.Optional;

public class Customerserviceimpl implements Customerservice {
    
    private CustomerRepo customerRepo;


    public Customerserviceimpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customermodel save(Customermodel customermodel) throws CustomerExistsException {
        Optional<Customermodel> getcustomerbyid = this.customerRepo.getcustomerbyid(customermodel.getId());
        if (getcustomerbyid.isPresent()){
            throw new CustomerExistsException("this customer alredy exist this id "+customermodel.getId());
        }

        return this.customerRepo.save(customermodel);
    }
}
