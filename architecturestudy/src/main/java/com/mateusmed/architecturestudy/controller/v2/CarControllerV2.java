package com.mateusmed.architecturestudy.controller.v2;

import com.mateusmed.architecturestudy.enuns.MakerEnum;
import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v2.CarResponseV2;
import com.mateusmed.architecturestudy.service.ICarService;
import com.mateusmed.architecturestudy.service.impl.CarServiceV2;
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
