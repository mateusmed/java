package com.mateusmed.architecturestudy.request.v1;

import javax.validation.constraints.NotNull;

public class CarRequestV1 {

    @NotNull(message = "Name is mandatory")
    private String name;

}
