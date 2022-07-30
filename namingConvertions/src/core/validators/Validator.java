package core.validators;

import entities.Customer;

public class Validator implements ValidatorService {
    public void validateFirstNameIfEmpty(Customer customer) throws Exception {
        if (customer.getFirstName().isEmpty()) {
            throw new Exception("Validasyon hatası");
        }
    }

     public void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (customer.getLastName().isEmpty()) {
            throw new Exception("Validasyon hatası");
        }
    }

     public void validateNationalIdentityIsEmpty(Customer customer) throws Exception {
        if (customer.getNationalIdentity().isEmpty()) {
            throw new Exception("Validasyon hatası");
        }
    }

     public void validateFirstNameLenght(Customer customer) throws Exception {
        if (customer.getFirstName().length() < 3) {
            throw new Exception("Validasyon hatası! isim en az 2 karakter olmali");
        }
    }
}
