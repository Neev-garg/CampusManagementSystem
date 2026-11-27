package com.campus.model;

/**
 * Represents an Administrator user.
 * Demonstrates Inheritance and Polymorphism.
 */
public class Admin extends User {

    public Admin() {
        setRole("ADMIN");
    }

    public Admin(int userId, String username, String password) {
        super(userId, username, password, "ADMIN");
    }

    @Override
    public void displayWelcomeBanner() {
        System.out.println("Welcome, Administrator (" + getUsername() + ")!");
    }
}

