package com.example.test.service;

import com.example.test.request.DataResquest;
import com.example.test.response.DataResponse;
import org.springframework.stereotype.Component;



@Component
public interface IMyInterfaceService {

    public DataResponse myMethod(DataResquest dataResquest);

}
