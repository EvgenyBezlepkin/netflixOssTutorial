package com.example.demo_fc;

import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.hystrix.HystrixFeign;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;


@FeignClient(name = "gallery-service", url = "http://localhost:8081/")
public interface ServiceFeignClient {


    @RequestLine("GET /show")
    Data getAllEmployeesList();

}
