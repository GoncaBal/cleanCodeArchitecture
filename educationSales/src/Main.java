import business.abstracts.EducationService;
import business.concretes.EducationManager;
import business.concretes.PercentDiscountCampaignManager;
import business.concretes.StandartCampaignManager;
import dataAccess.concretes.nHibernateEducationRepository;
import entities.Education;

public class Main {
    public static void main(String[] args) {
        EducationService educationService = new EducationManager(new nHibernateEducationRepository(),new PercentDiscountCampaignManager());
        for (Education education : educationService.getAll())
            System.out.println(education.getName()+" egitimi ucreti: " + education.getPrice());
    }
}
