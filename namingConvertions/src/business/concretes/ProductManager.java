package business.concretes;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.Product;

import java.util.List;

public class ProductManager implements ProductService {
  ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
