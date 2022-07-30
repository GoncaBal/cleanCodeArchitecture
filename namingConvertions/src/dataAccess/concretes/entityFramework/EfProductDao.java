package dataAccess.concretes.entityFramework;

import dataAccess.abstracts.ProductDao;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class EfProductDao implements ProductDao {
    @Override
    public List<Product> getAll() {
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Elma"));
        return products;
    }
}
