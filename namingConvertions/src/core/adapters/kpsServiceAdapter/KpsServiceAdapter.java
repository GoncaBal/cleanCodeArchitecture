package core.adapters.kpsServiceAdapter;

import MernisReferance.KpsService;
import business.abstracts.PersonService;
import entities.Person;

public class KpsServiceAdapter implements PersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService=new KpsService();
        return kpsService.checkPerson(person.getFirstName(), person.getLastName(), person.getNationalIdentity(), person.getBirthOfYear());
    }
}
