package com.selflearning.to_do_api.exception;

public class TodoBadRequestException extends RuntimeException{
    public TodoBadRequestException(String message){
        super(message);
    }
}
