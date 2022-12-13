package com.mateusmed.architecturestudy.service.impl;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mateusmed.architecturestudy.response.v1.CarResponseV1;
import com.mateusmed.architecturestudy.service.ICarService;
import com.mateusmed.architecturestudy.service.clients.CarReceivedT;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
@Component("CarServiceV2")
public class CarServiceV2  implements ICarService {


    //test client
    public void method(){

        try{
            // Create a neat value object to hold the URL
            URL url = new URL("http://localhost:3000/v2/car");

            // Open a connection(?) on the URL(??) and cast the response(???)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

            // This line makes the request
            InputStream responseStream = connection.getInputStream();

            // Manually converting the response body InputStream to APOD using Jackson
            ObjectMapper mapper = new ObjectMapper();
            List<CarReceivedT> apod = mapper.readValue(responseStream,
                                                        mapper.getTypeFactory().constructCollectionType(List.class, CarReceivedT.class));

            // Finally we have the response
            System.out.println(apod);

        }catch (Exception e){
            System.out.println("=======> " + e.getMessage());
            e.printStackTrace();
        }


    }


    @Override
    public CarResponseV1 getAllCars() {

        method();
        return null;
    }

    @Override
    public CarResponseV1 getCarById(String id) {
        return null;
    }
}
