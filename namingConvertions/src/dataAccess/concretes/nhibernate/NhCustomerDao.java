package dataAccess.concretes.nhibernate;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class NhCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Nhibernate ile veritabanına eklendi");
    }

    @Override
    public boolean checkCustomerExist(Customer customer) {
        return false;
    }
}
