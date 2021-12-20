package com.ms.rest.day0.restful.web.services.exception;

public class ExceptionResponse {

    private  String message;

    public ExceptionResponse(){

    }

    public ExceptionResponse(String msg){
        message = msg ;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
