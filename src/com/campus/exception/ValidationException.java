package com.campus.exception;

/**
 * Thrown when user input or entity fields fail validation rules.
 */
public class ValidationException extends CampusException {

    public ValidationException(String message) {
        super(message);
    }
}

