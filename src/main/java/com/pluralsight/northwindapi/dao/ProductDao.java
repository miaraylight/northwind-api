package com.pluralsight.northwindapi.dao;

import com.pluralsight.northwindapi.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
    Product add(Product product);
    Product update(int id, Product product);
    void deleteById(int id);
}
