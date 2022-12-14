package com.mateusmed.architecturestudy.v2.response;

import com.mateusmed.architecturestudy.enums.MakerEnum;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CarResponseV2 {

    private String name;
    private MakerEnum maker;

}
