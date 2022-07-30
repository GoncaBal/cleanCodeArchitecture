package business.concretes;

import business.abstracts.EmployeeService;
import dataAccess.abstracts.EmployeeDao;
import entities.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
   EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
