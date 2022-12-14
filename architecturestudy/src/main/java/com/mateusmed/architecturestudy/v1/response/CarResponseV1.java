package com.mateusmed.architecturestudy.v1.response;

import com.mateusmed.architecturestudy.enums.MakerEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarResponseV1 {

    private String name;
    private MakerEnum maker;

}
