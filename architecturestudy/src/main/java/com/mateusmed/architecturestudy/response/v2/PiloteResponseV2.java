package com.mateusmed.architecturestudy.response.v2;

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
