package com.ms.rest.day0.restful.web.services.beans;

public class HelloWorldBean {

    private String message;
    private int id ;
    public HelloWorldBean(String msg){
        message = msg ;
        this.id = 1 ;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
