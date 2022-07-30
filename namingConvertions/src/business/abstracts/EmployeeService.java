package business.abstracts;

import entities.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    List<Employee> getAll();
}
