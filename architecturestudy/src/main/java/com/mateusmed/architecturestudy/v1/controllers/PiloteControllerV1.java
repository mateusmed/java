package com.mateusmed.architecturestudy.v1.controllers;


import com.mateusmed.architecturestudy.enums.MakerEnum;
import com.mateusmed.architecturestudy.v1.request.CarRequestV1;
import com.mateusmed.architecturestudy.v1.response.CarResponseV1;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1")
public class PiloteControllerV1 {


//    @Autowired
//    private IPiloteService piloteService;

    @RequestMapping(value = "/pilote", method = RequestMethod.GET)
    public ResponseEntity<CarResponseV1> getAllPilotes(){

        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/pilote/{id}", method = RequestMethod.GET)
    public ResponseEntity<CarResponseV1> getPiloteById(@PathVariable String id){

        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = "/pilote", method = RequestMethod.POST)
    public CarResponseV1 registerPilote(@RequestBody CarRequestV1 carRequest){

        System.out.println("Car received: {}"+ carRequest);

        return new CarResponseV1("f2004", MakerEnum.FERRARI);
    }
}
