package com.pluralsight.northwindapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(String country){
        return "Hello " + country;
    }
}
