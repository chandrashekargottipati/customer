package foodie.service;

import foodie.exception.CustomerExistsException;
import foodie.model.Customermodel;
import foodie.repository.CustomerRepo;

import java.util.List;
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
