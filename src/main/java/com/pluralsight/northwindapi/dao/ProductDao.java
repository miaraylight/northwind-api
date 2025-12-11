package com.pluralsight.northwindapi.dao;

import com.pluralsight.northwindapi.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
}
