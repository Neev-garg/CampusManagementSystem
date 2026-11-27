package com.campus.exception;

/**
 * Thrown when login credentials or user permissions are invalid.
 */
public class AuthenticationException extends CampusException {

    public AuthenticationException(String message) {
        super(message);
    }
}

