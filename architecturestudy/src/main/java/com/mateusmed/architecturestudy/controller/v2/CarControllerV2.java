package com.mateusmed.architecturestudy.controller.v2;

import com.mateusmed.architecturestudy.enuns.MakerEnum;
import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v2.CarResponseV2;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v2")
public class CarControllerV2 {

    @PostMapping(value = "/car")
    public List<CarResponseV2> postCar(@Valid @RequestBody CarRequestV1 carRequest){

        log.info("==> {}", carRequest);

        List<CarResponseV2> myList =  List.of(new CarResponseV2("name", MakerEnum.MCLAREN));
        return myList;
    }
}
