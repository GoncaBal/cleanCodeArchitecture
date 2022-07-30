package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class EfCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Entity Framework ile veritabanına eklendi");
    }

    @Override
    public boolean checkCustomerExist(Customer customer) {
        return true;
    }
}
