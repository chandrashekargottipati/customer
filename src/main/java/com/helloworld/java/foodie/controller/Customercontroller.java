package com.helloworld.java.foodie.controller;

import com.helloworld.java.foodie.exception.CustomerExistsException;
import com.helloworld.java.foodie.model.Customermodel;
import com.helloworld.java.foodie.service.Customerserviceimpl;

public class Customercontroller {

    private Customerserviceimpl customerServiceimpl;

    public Customercontroller(Customerserviceimpl customerServiceimpl) {
        this.customerServiceimpl = customerServiceimpl;
    }

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException {
        return this.customerServiceimpl.save(customermodel);
    }
}
