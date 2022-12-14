package com.mateusmed.architecturestudy.service;

import com.mateusmed.architecturestudy.v1.response.CarResponseV1;


public interface ICarService {

    public CarResponseV1 getAllCars();

    public CarResponseV1 getCarById(String id);

}
