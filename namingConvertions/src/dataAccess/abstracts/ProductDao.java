package dataAccess.abstracts;

import entities.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
}
