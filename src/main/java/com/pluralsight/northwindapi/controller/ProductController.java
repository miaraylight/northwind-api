package com.pluralsight.northwindapi.controller;

import com.pluralsight.northwindapi.dao.ProductDao;
import com.pluralsight.northwindapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductDao productDao;

    @RequestMapping(path = "/products")
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @RequestMapping(path = "/products/{id}")
    public Product getById(@PathVariable int id) {
        return productDao.getById(id);
    }
}
