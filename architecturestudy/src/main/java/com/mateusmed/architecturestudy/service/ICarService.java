package com.mateusmed.architecturestudy.service;

import com.mateusmed.architecturestudy.request.v1.CarRequestV1;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import org.springframework.stereotype.Service;


public interface ICarService {

    public CarResponseV1 getAllCars();

    public CarResponseV1 getCarById(String id);

}
