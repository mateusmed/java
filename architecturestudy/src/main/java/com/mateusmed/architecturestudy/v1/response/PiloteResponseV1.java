package com.mateusmed.architecturestudy.v1.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PiloteResponseV1 {

    private String name;
    private Integer age;
    private String cpf;

}
