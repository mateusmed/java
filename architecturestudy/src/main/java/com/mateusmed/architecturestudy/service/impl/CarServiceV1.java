package com.mateusmed.architecturestudy.service.impl;

import com.mateusmed.architecturestudy.enuns.GenericErrorMessageEnum;
import com.mateusmed.architecturestudy.exceptions.GenericException;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import com.mateusmed.architecturestudy.service.clients.CarClientFeign;
import com.mateusmed.architecturestudy.service.clients.CarReceivedT;
import feign.FeignException;
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

        try{
            List<CarReceivedT> carReceivedTest = carClientFeign.getCars();

        }catch (FeignException e){

            throw new GenericException(e.status(),
                                       GenericErrorMessageEnum.ERRO_EFETUAR_CHAMADA_HTTP_SERVICO_X,
                                       e.getMessage());
        }

        return null;
    }

    @Override
    public CarResponseV1 getCarById(String id){

        log.info("try to get by id: {}", id);
        throw new NullPointerException();
    }
}
