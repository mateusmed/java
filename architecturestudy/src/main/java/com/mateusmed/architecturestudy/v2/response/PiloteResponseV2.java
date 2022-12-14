package com.mateusmed.architecturestudy.v2.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PiloteResponseV2 {

    private String name;
    private Integer age;
    private String cpf;
    private String medicalHistory;

}
