package io.github.sandersgutierrez.domain.customer;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CustomerService {
    Customer[] getCustomerByName(@WebParam(name = "name") String name) throws NoSuchCustomerException;
}
