package com.crud.microservice.microServicecrud.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {
        super("User Not Found Exception.");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
