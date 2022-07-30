package core.validators;

import entities.Customer;

public interface ValidatorService {
    /**
     * Nesneyi validator kullanarak isim girilip girilmediğinin kontrolu
     * @param customer dogrulanacak musteri
     * @return customer
     */
    void validateFirstNameIfEmpty(Customer customer) throws Exception;
    /**
     * Nesneyi validator kullanarak soyisim girilip girilmediğinin kontrolu
     * @param customer dogrulanacak musteri
     * @return customer
     */
    void validateLastNameIfEmpty(Customer customer) throws Exception;
    /**
     * Nesneyi validator kullanarak tcno girilip girilmediğinin kontrolu
     * @param customer dogrulanacak musteri
     * @return customer
     */
    void validateNationalIdentityIsEmpty(Customer customer) throws Exception;
    /**
     * Nesneyi validator kullanarak ismin kac karakter oldugu kontrolu
     * @param customer dogrulanacak musteri
     * @return customer
     */
    void validateFirstNameLenght(Customer customer) throws Exception;
}
