package com.mateusmed.architecturestudy.v1.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;


@Data
public class CarRequestV1 implements Serializable {

    @NotNull
    @NotBlank(message = "O nome é required")
    private String name;

}
