package business.abstracts;

import entities.Customer;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void addByOtherBusiness(Customer customer) throws Exception;
}
