package com.mateusmed.architecturestudy.controller.v1;


import com.mateusmed.architecturestudy.enuns.MakerEnum;
import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Slf4j
@Controller
@RequestMapping("/v1")
public class CarControllerV1 {

    @Autowired
    @Qualifier("CarServiceV1")
    private ICarService carServiceV1;


    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ResponseEntity<CarResponseV1> getAllCars(){

        CarResponseV1 carResponseV1 = new CarResponseV1("f2004", MakerEnum.FERRARI);
        System.out.println(carResponseV1);

        carServiceV1.getAllCars();

        return ResponseEntity.ok(carResponseV1);
    }

    @RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
    public ResponseEntity<CarResponseV1> getCarById(@PathVariable String id){

        return ResponseEntity.ok(null);
    }


    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public ResponseEntity<CarResponseV1> postCar(@Valid
                                                 @RequestBody
                                                 CarRequestV1 carRequest){

        return ResponseEntity.ok(new CarResponseV1("ok", MakerEnum.FERRARI));
    }

}
