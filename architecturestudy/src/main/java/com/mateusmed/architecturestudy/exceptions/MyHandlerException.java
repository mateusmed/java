package com.mateusmed.architecturestudy.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.net.ssl.SSLEngineResult;

@Slf4j
@ControllerAdvice
public class MyHandlerException{

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    public ResponseEntity<?> genericNotFoundMessage() {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("my custom not found");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleExceptions(Exception e){
        return ResponseEntity.ok("Exception");
    }

}
