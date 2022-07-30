package dataAccess.concretes;

import dataAccess.abstracts.EducationRepository;
import entities.Education;

import java.util.ArrayList;
import java.util.List;

public class nHibernateEducationRepository implements EducationRepository {
    @Override
    public List<Education> getAll() {
        List<Education> educations = new ArrayList<>();
        educations.add(new Education(1, "C# Kursu", 400));
        educations.add(new Education(2, "Java Kursu", 500));
        educations.add(new Education(3, "Python Kursu", 400));
        return educations;
    }
}
