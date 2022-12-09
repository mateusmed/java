package com.mateusmed.architecturestudy.response.v2;

import com.mateusmed.architecturestudy.enuns.MakerEnum;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CarResponseV2 {

    private String name;
    private MakerEnum maker;

}
