package com.mateusmed.architecturestudy.service.impl;

import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CarServiceV1 implements ICarService {

    @Override
    public CarResponseV1 getAllCars() {
        return null;
    }

    @Override
    public CarResponseV1 getCarById(String id){

        log.info("try to get by id: {}", id);
        throw new NullPointerException();
    }
}