package com.campus.util;

import com.campus.exception.ValidationException;

/**
 * Reusable validation utility for user inputs and domain constraints.
 */
public final class Validator {

    private Validator() {
    }

    public static void validateNonEmpty(String value, String fieldName) throws ValidationException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidationException(fieldName + " cannot be empty.");
        }
    }

    public static void validateEmail(String email) throws ValidationException {
        validateNonEmpty(email, "Email");
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new ValidationException("Invalid email format: " + email);
        }
    }

    public static void validateSemester(int semester) throws ValidationException {
        if (semester < 1 || semester > 8) {
            throw new ValidationException("Semester must be between 1 and 8.");
        }
    }

    public static void validateAttendance(double percentage) throws ValidationException {
        if (percentage < 0.0 || percentage > 100.0) {
            throw new ValidationException("Attendance percentage must be between 0 and 100.");
        }
    }

    public static void validateMarks(int marks, String subject) throws ValidationException {
        if (marks < 0 || marks > 100) {
            throw new ValidationException(subject + " marks must be between 0 and 100.");
        }
    }

    public static void validateFeeAmount(double amount) throws ValidationException {
        if (amount < 0.0) {
            throw new ValidationException("Fee amount cannot be negative.");
        }
    }

    public static void validatePassword(String password) throws ValidationException {
        validateNonEmpty(password, "Password");
        if (password.length() < 4) {
            throw new ValidationException("Password must be at least 4 characters long.");
        }
    }
}

