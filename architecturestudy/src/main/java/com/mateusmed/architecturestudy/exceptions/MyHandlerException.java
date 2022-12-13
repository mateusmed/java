package com.mateusmed.architecturestudy.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@ControllerAdvice
public class MyHandlerException{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> badRequest(MethodArgumentNotValidException e) {

        log.error("logger ==> " + e.getMessage());

        List<String> errorsMessages = e.getBindingResult().getFieldErrors()
                                                  .stream()
                                                  .map(FieldError::getDefaultMessage)
                                                  .collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .body(errorsMessages);
    }

//    @ExceptionHandler(FeignException.class)
//    public ResponseEntity<?> feignException(FeignException.FeignClientException e){
//
//        log.info("{}", e.getMessage());
//        log.error("{}", e.responseBody().get());
//        log.error("{}", e.status());
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                .body("ok");
//    }


    @ExceptionHandler(GenericException.class)
    public ResponseEntity<?> handleGenericExceptions(GenericException e){

        int statusCode = Integer.parseInt(e.getHttpCode());

        ErrorResponse errorResponse = new ErrorResponse(e.getHttpCode(),
                                                        e.getMessage(),
                                                        e.getErrorCode(),
                                                        e.getDetailedMessage());

        return ResponseEntity.status(statusCode)
                      .contentType(MediaType.APPLICATION_JSON)
                       .body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleExceptions(Exception e){

        log.error("logger ==> " + e.getMessage());

        e.printStackTrace();

        return ResponseEntity.ok(e.getMessage());
    }

}
