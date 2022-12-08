package com.mateusmed.architecturestudy.response.v1;

import com.mateusmed.architecturestudy.enuns.MakerEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarResponseV1 {

    private String name;
    private MakerEnum maker;

}
