package com.mateusmed.architecturestudy.service.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
public class CarReceivedT {

    @JsonProperty("xname")
    private String name;
}
