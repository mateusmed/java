package com.mateusmed.architecturestudy.controller.v3;


import com.mateusmed.architecturestudy.enuns.MakerEnum;
import com.mateusmed.architecturestudy.response.v2.CarResponseV2;
import com.mateusmed.architecturestudy.service.ICarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v3")
public class CarControllerV3 {

    @Autowired
    @Qualifier("CarServiceV3")
    private ICarService carServiceV3;

    @GetMapping("/car")
    public List<CarResponseV2> getAllCars(){

        carServiceV3.getAllCars();

        List<CarResponseV2> myList =  List.of(new CarResponseV2("name", MakerEnum.MCLAREN));
        return myList;
    }

}
