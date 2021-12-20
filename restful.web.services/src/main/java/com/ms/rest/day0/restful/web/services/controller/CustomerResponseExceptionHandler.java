package com.ms.rest.day0.restful.web.services.controller;

import com.ms.rest.day0.restful.web.services.exception.EmployeeNotFoundException;
import com.ms.rest.day0.restful.web.services.exception.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.jws.WebResult;

@ControllerAdvice
@RestController
public class CustomerResponseExceptionHandler extends ResponseEntityExceptionHandler {



@ExceptionHandler(Exception.class)
public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
   ExceptionResponse exResp =    new ExceptionResponse(ex.getMessage());
   return new ResponseEntity<>(exResp, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
 }

   @ExceptionHandler(EmployeeNotFoundException.class)
    public final ResponseEntity<EmployeeNotFoundException> handleEmployeeException(EmployeeNotFoundException ex, WebResult req){
        ExceptionResponse exResp =    new ExceptionResponse(ex.getMessage());
        return new ResponseEntity(exResp, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }
}
