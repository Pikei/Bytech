package com.bytech.backend.exceptions;

public class UserAlredyExistsException extends RuntimeException {
    public UserAlredyExistsException(String message) {
        super(message);
    }
}
