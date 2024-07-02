package foodie.controller;

import foodie.exception.CustomerExistsException;
import foodie.model.Customermodel;
import foodie.service.Customerserviceimpl;

public class Customercontroller {

    private Customerserviceimpl customerServiceimpl;

    public Customercontroller(Customerserviceimpl customerServiceimpl) {
        this.customerServiceimpl = customerServiceimpl;
    }

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException {
        return this.customerServiceimpl.save(customermodel);
    }
}
