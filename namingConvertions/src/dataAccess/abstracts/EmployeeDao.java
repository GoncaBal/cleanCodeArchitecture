package dataAccess.abstracts;

import entities.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAll();

    void add(Employee employee);
}
