package dataAccess.abstracts;

import entities.Education;

import java.util.List;

public interface EducationRepository {
    List<Education> getAll();
}
