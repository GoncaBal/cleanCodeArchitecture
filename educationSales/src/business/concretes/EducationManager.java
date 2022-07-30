package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.EducationService;
import dataAccess.abstracts.EducationRepository;
import entities.Education;

import java.util.List;

public class EducationManager implements EducationService {
    EducationRepository educationRepository;
    CampaignService campaignService;

    public EducationManager(EducationRepository educationRepository, CampaignService campaignService) {
        this.educationRepository = educationRepository;
        this.campaignService = campaignService;
    }

    @Override
    public List<Education> getAll() {
        List<Education> educations = educationRepository.getAll();
        campaignService.updatePrice(educations);
        return educations;
    }


}
