package com.helloworld.java.foodie.service;

import com.helloworld.java.foodie.exception.CustomerExistsException;
import com.helloworld.java.foodie.model.Customermodel;

public interface Customerservice {

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException;
}
