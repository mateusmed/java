package com.mateusmed.architecturestudy.controller.v2;

import com.mateusmed.architecturestudy.response.v2.PiloteResponseV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class PiloteControllerV2 {

    @GetMapping(value = "/pilote")
    public List<PiloteResponseV2> getAllPilotes(){
        return List.of(new PiloteResponseV2("senna", 28, "12345678900", "broken arm"));
    }

}
