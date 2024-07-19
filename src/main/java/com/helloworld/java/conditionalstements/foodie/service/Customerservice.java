package com.helloworld.java.conditionalstements.foodie.service;

import com.helloworld.java.conditionalstements.foodie.exception.CustomerExistsException;
import com.helloworld.java.conditionalstements.foodie.model.Customermodel;

public interface Customerservice {

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException;
}
