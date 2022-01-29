package com.example.test.service;


import com.example.test.request.DataResquest;
import com.example.test.response.DataResponse;
import org.springframework.stereotype.Service;


@Service
public class MeuServiceY implements IMyInterfaceService {

    @Override
    public DataResponse myMethod(DataResquest dataResquest) {

        //

        return new DataResponse(1, 1);
    }
}
