package com.mateusmed.architecturestudy.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mateusmed.architecturestudy.configs.JsonBodyHandler;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import com.mateusmed.architecturestudy.service.clients.CarReceivedT;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.function.Supplier;

@Service
@Component("CarServiceV3")
public class CarServiceV3 implements ICarService {


    private void methodClient(){
        // create a client
        HttpClient client = HttpClient.newHttpClient();

        // create a request
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:3000/v2/car"))
                                         .header("accept", "application/json")
                                         .build();

        try{


//            var response = client.send(request, new JsonBodyHandler<>(APOD.class));

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            List<CarReceivedT> myObjects = mapper.readValue(response.body(),
                                                            new TypeReference<>(){});

            System.out.println("my objects: " +  myObjects);
        }catch (Exception e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }

    @Override
    public CarResponseV1 getAllCars() {

        methodClient();
        return null;
    }

    @Override
    public CarResponseV1 getCarById(String id) {
        return null;
    }
}
