package com.mateusmed.architecturestudy.v2.controllers;

import com.mateusmed.architecturestudy.enums.MakerEnum;
import com.mateusmed.architecturestudy.v1.request.CarRequestV1;
import com.mateusmed.architecturestudy.v2.response.CarResponseV2;
import com.mateusmed.architecturestudy.service.ICarService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v2")
public class CarControllerV2 {



    @Autowired
    @Qualifier("CarServiceV2")
    private ICarService carServiceV2;
    

    @GetMapping("/car")
    public List<CarResponseV2> getAllCars(){

        carServiceV2.getAllCars();

        List<CarResponseV2> myList =  List.of(new CarResponseV2("name", MakerEnum.MCLAREN));
        return myList;
    }

    @PostMapping(value = "/car")
    public List<CarResponseV2> postCar(@Valid @RequestBody CarRequestV1 carRequest){

        log.info("==> {}", carRequest);

        List<CarResponseV2> myList =  List.of(new CarResponseV2("name", MakerEnum.MCLAREN));
        return myList;
    }
}
