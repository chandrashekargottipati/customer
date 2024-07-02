package foodie.util;

import foodie.controller.Customercontroller;
import foodie.repository.CustomerRepo;
import foodie.service.Customerserviceimpl;

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
