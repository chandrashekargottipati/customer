package com.helloworld.java.conditionalstements.foodie.controller;

import com.helloworld.java.conditionalstements.foodie.exception.CustomerExistsException;
import com.helloworld.java.conditionalstements.foodie.model.Customermodel;
import com.helloworld.java.conditionalstements.foodie.service.Customerserviceimpl;

public class Customercontroller {

    private Customerserviceimpl customerServiceimpl;

    public Customercontroller(Customerserviceimpl customerServiceimpl) {
        this.customerServiceimpl = customerServiceimpl;
    }

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException {
        return this.customerServiceimpl.save(customermodel);
    }
}
