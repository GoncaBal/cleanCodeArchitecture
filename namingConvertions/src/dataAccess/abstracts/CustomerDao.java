package dataAccess.abstracts;

import entities.Customer;

public interface CustomerDao {

    void add(Customer customer);
    boolean checkCustomerExist(Customer customer);
}
