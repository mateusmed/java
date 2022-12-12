package com.mateusmed.architecturestudy.service.impl;

import com.mateusmed.architecturestudy.service.clients.*;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CarServiceV1 implements ICarService {

    @Autowired
    private CarClientFeign carClientFeign;

    @Override
    public CarResponseV1 getAllCars() {
        List<CarReceivedT> carReceivedTest = carClientFeign.getCars();
        System.out.println("========> "+ carReceivedTest);
        return null;
    }

    @Override
    public CarResponseV1 getCarById(String id){

        log.info("try to get by id: {}", id);
        throw new NullPointerException();
    }
}
