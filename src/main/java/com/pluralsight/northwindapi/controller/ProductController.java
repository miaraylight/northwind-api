package com.pluralsight.northwindapi.controller;

import com.pluralsight.northwindapi.dao.ProductDao;
import com.pluralsight.northwindapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    ProductDao productDao;

    @Autowired
    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @RequestMapping(path = "products")
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @RequestMapping(path = "products/{id}")
    public Product getById(@PathVariable int id) {
        return productDao.getById(id);
    }

    @RequestMapping(path = "products", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productDao.add(product);
    }

    @RequestMapping(path = "products/{id}", method = RequestMethod.PUT)
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productDao.update(id, product);
    }

    @RequestMapping(path = "products/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        productDao.deleteById(id);
    }
}
