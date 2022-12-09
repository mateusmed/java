package com.mateusmed.architecturestudy.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@ControllerAdvice
public class MyHandlerException{

//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//
//        Map<String, List<String>> body = new HashMap<>();
//
//        List<String> errors = ex.getBindingResult()
//                .getFieldErrors()
//                .stream()
//                .map(DefaultMessageSourceResolvable::getDefaultMessage)
//                .collect(Collectors.toList());
//
//        body.put("errors", errors);
//
//        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
//    }

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

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleExceptions(Exception e){

        log.error("logger ==> " + e.getMessage());

        return ResponseEntity.ok(e.getMessage());
    }

}
