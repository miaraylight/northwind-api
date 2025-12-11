package com.pluralsight.northwindapi.controller;

import com.pluralsight.northwindapi.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    @RequestMapping(path = "/categories")
    public List<Category> getAll() {
        return getCategories();
    }


    @RequestMapping(path = "/categories/{id}", method = RequestMethod.GET)
    public Category getById(@PathVariable int id){
        List<Category> categories = getCategories();

        Category result = categories.stream().filter(category -> category.getCategoryId() == id).findFirst().orElse(null);
        return result;
    }

    private static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        categories.add(new Category(1, "Electronics"));
        categories.add(new Category(2, "Clothing"));
        categories.add(new Category(3, "Books"));
        categories.add(new Category(4, "Home & Garden"));
        categories.add(new Category(5, "Sports & Outdoors"));
        categories.add(new Category(6, "Food & Beverages"));
        categories.add(new Category(7, "Health & Beauty"));
        categories.add(new Category(8, "Toys & Games"));
        categories.add(new Category(9, "Automotive"));
        categories.add(new Category(10, "Office Supplies"));

        return categories;
    }

}
