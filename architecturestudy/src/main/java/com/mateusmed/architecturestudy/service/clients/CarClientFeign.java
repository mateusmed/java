package com.mateusmed.architecturestudy.service.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "car-client",
             url = "http://localhost:3000")
public interface CarClientFeign {

    @GetMapping("/car")
    List<CarReceivedT> getCars();
}
