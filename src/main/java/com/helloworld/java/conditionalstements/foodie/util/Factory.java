package com.helloworld.java.conditionalstements.foodie.util;

import com.helloworld.java.conditionalstements.foodie.controller.Customercontroller;
import com.helloworld.java.conditionalstements.foodie.repository.CustomerRepo;
import com.helloworld.java.conditionalstements.foodie.service.Customerserviceimpl;

public class Factory {

    public static CsvreadCustomerUtill getCsv() {
        return new CsvreadCustomerUtill();
    }

    public static CustomerRepo getCustomerRepository() {
        return new CustomerRepo();
    }

    public static Customerserviceimpl getCustomerServiceImpl() {
        return new Customerserviceimpl(getCustomerRepository());
    }

    public static Customercontroller getCustomerController() {
        return new Customercontroller(getCustomerServiceImpl());
    }
}
