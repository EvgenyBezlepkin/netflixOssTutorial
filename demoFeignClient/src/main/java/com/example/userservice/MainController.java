package com.example.userservice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MainController {

    @RequestMapping(path = "/testFeign")
    public Collection<Bucket> getDataByFeignClient(Model model) {

        return FeignHolder.create().getAll();
    }
}
