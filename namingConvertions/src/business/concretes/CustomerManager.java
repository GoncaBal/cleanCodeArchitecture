package business.concretes;

import business.abstracts.CustomerService;
import business.abstracts.PersonService;
import core.validators.ValidatorService;
import dataAccess.abstracts.CustomerDao;
import entities.Customer;
import entities.Person;

public class CustomerManager implements CustomerService {
    private ValidatorService validatorService;
    private CustomerDao customerDao;
    private PersonService personService;
    public CustomerManager(ValidatorService validatorService, CustomerDao customerDao, PersonService personService) {
        this.validatorService = validatorService;
        this.customerDao=customerDao;
        this.personService=personService;
    }

    public void add(Customer customer) throws Exception {

        validatorService.validateFirstNameIfEmpty(customer);
        validatorService.validateLastNameIfEmpty(customer);
//        validatorService.validateNationalIdentityIsEmpty(customer);
        checkPersonExist(customer);
        customerDao.checkCustomerExist(customer);
        customerDao.add(customer);


    }

    public void addByOtherBusiness(Customer customer) throws Exception {
        validatorService.validateFirstNameIfEmpty(customer);
        validatorService.validateLastNameIfEmpty(customer);
//        validatorService.validateNationalIdentityIsEmpty(customer);
        validatorService.validateFirstNameLenght(customer);
        checkPersonExist(customer);
        customerDao.checkCustomerExist(customer);
        customerDao.add(customer);
    }

    private void checkCustomerExist(Customer customer) throws Exception {
        if (customerDao.checkCustomerExist(customer)) {
            throw new Exception("Müşteri zaten mevcut");
        }
    }

    private void checkPersonExist(Person person) throws Exception {
       if(!personService.checkPerson(person)){
           throw new Exception("Kişi bilgileri hatalı");
       }
    }

}