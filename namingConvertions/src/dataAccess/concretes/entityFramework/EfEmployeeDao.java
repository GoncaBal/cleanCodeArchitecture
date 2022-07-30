package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.EmployeeDao;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EfEmployeeDao implements EmployeeDao {


    @Override
    public List<Employee> getAll() {
        List<Employee> employees= new ArrayList<Employee>();
        employees.add(new Employee(1,"Ayşe","Fatma",2000,"1222",3000));
        return employees;
    }

    @Override
    public void add(Employee employee) {
        System.out.println("Employee eklendi");
    }
}
