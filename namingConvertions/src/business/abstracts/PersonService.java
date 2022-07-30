package business.abstracts;

import entities.Person;

public interface PersonService {
    /**
     * Nesneyi validator kullanarak kisinin gercek olup olmadıgının kontrolu
     * @param person dogrulanacak kisi
     * @return person
     */
    boolean checkPerson(Person person);
}
