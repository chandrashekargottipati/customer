package foodie.service;

import foodie.exception.CustomerExistsException;
import foodie.model.Customermodel;

public interface Customerservice {

    public Customermodel save(Customermodel customermodel) throws CustomerExistsException;
}
