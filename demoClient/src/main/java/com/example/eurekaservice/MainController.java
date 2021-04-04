package com.example.eurekaservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
public class MainController {

    private Bucket[] container = new Bucket[]{
            new Bucket("1", "Java", "OOP", 280, "http://infopulse-univer.com.ua/images/trenings/"),
            new Bucket("2", "Java", "Steram API", 437, "https://www.hdwallpaperslife.com/wp-content/uploads/2018/09/"),
            new Bucket("3", "Java", "Collections", 14, "https://i.ytimg.com/vi/oOOESCvGGcI/"),
            new Bucket("4", ".NET", "Basic", 1213, "https://upload.wikimedia.org/wikipedia/commons/0/0e/"),
            new Bucket("5", "C++", "Basic", 870, "https://encrypted-tbn0.gstatic.com/"),
            new Bucket("6", "JavaScript", "Angular 8", 155, "https://encrypted-tbn0.gstatic.com/")
    };


    @GetMapping(path = "/get")
    public Collection<Bucket> getAll() {
        return new ArrayList<>(Arrays.asList(container));
    }

}