package com.example.userservice;

import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.hystrix.HystrixFeign;

class FeignHolder {
    public static ServiceFeignClient create() {
        return HystrixFeign.builder().encoder(new GsonEncoder()).decoder(new GsonDecoder())
                .target(ServiceFeignClient.class, "http://localhost:8081/");
    }
}
