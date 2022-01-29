package com.example.test.controller;

import com.example.test.request.DataResquest;
import com.example.test.response.DataResponse;
import com.example.test.service.IMyInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {


    @Qualifier("meuServiceX")
    @Autowired
    private IMyInterfaceService iMyInterfaceService;


    @GetMapping("/")
    public String index() {

        DataResponse dataResponse = iMyInterfaceService
                                    .myMethod(new DataResquest(1, 2));

        System.out.println(dataResponse);
        return "Greetings from Spring Boot!";
    }

}