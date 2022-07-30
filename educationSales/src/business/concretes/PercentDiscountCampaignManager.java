package business.concretes;

import business.abstracts.CampaignService;
import entities.Education;

import java.util.List;

public class PercentDiscountCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Education> educations) {
        for (Education education:educations){
            education.setPrice(education.getPrice()-(education.getPrice()*getPercentageDiscount()));
        }
    }
    private double getPercentageDiscount() {
        return Double.parseDouble("0.90");
    }
}
