package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(path = "/show")
    public Data getAllEmployeesList() {
        return new Data(5, "hello");
    }
}