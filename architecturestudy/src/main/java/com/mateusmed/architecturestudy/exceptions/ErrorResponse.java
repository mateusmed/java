package com.mateusmed.architecturestudy.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private String httpCode;
    private String message;

    private String errorCode;
    private String detailedMessage;

}
