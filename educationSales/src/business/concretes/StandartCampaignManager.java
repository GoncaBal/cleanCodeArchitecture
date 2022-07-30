package business.concretes;

import business.abstracts.CampaignService;
import entities.Education;

import java.util.List;

public class StandartCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education : educations) {
            education.setPrice(getCurrentPrice());
        }
    }

    private double getCurrentPrice() {
        return 25;
    }
}
