package com.helloworld.java.foodie.util;

import com.helloworld.java.foodie.controller.Customercontroller;
import com.helloworld.java.foodie.repository.CustomerRepo;
import com.helloworld.java.foodie.service.Customerserviceimpl;

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
