import business.abstracts.CustomerService;
import business.abstracts.EmployeeService;
import business.abstracts.ProductService;
import business.concretes.CustomerManager;
import business.concretes.EmployeeManager;
import business.concretes.ProductManager;
import core.adapters.kpsServiceAdapter.KpsServiceAdapter;
import core.validators.Validator;
import dataAccess.abstracts.ProductDao;
import dataAccess.concretes.entityFramework.EfCustomerDao;
import dataAccess.concretes.entityFramework.EfEmployeeDao;
import dataAccess.concretes.entityFramework.EfProductDao;
import entities.Customer;
import entities.Employee;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        customerDemo();
//        employeeDemo();

        ProductService productManager = new ProductManager(new EfProductDao());
        for (Product product : productManager.getAll())
            System.out.println(product.getName());
    }

    private static void employeeDemo() {
        EmployeeService employeeManager = new EmployeeManager(new EfEmployeeDao());
        for (Employee employee : employeeManager.getAll()) {
            System.out.println(employee.getFirstName());
        }
    }

    private static void customerDemo() throws Exception {
        CustomerService customerManager = new CustomerManager(new Validator(), new EfCustomerDao(), new KpsServiceAdapter());
        customerManager.add(new Customer(1, "Gonca", "Bal", 1994, "1351", 1));
        customerManager.addByOtherBusiness(new Customer(2, "Reyhan", "Bal", 1995, "3333", 1));
    }

}

