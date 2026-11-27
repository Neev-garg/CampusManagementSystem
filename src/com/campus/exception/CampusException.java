package com.campus.exception;

/**
 * Base custom exception for all Campus Management System errors.
 * Demonstrates Exception Handling and Inheritance.
 */
public class CampusException extends Exception {

    public CampusException(String message) {
        super(message);
    }

    public CampusException(String message, Throwable cause) {
        super(message, cause);
    }
}

