package com.mateusmed.architecturestudy.controller.v1;


import com.mateusmed.architecturestudy.enuns.MakerEnum;
import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/v1")
public class CarControllerV1 {

    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ResponseEntity<CarResponseV1> getCar(){
        log.info("===");
        CarResponseV1 carResponseV1 = new CarResponseV1("f2004", MakerEnum.FERRARI);
        System.out.println(carResponseV1);

        return ResponseEntity.ok(carResponseV1);
    }


    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public CarResponseV1 postCar(@RequestBody
                                 @Valid
                                 CarRequestV1 carRequest){

        System.out.println("Car received: {}"+ carRequest);

        return new CarResponseV1("f2004", MakerEnum.FERRARI);
    }

}
