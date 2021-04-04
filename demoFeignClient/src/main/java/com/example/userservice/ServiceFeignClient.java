package com.example.userservice;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.Collection;


@FeignClient(name = "gallery-service", url = "http://localhost:8081/")
public interface ServiceFeignClient {


    @RequestLine("GET /show")
    Collection<Bucket> getAll();

}
