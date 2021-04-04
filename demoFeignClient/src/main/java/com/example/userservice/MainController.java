package com.example.userservice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/testFeign")
    public String getDataByFeignClient(Model model) {

        return FeignHolder.create().getAllEmployeesList().toString();
    }
}
