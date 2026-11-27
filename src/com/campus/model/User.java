package com.campus.model;

/**
 * Abstract base class representing a system user.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class User {
    private int userId;
    private String username;
    private String password;
    private String role;

    public User() {
    }

    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Polymorphic method to display role-specific welcome banner.
     */
    public abstract void displayWelcomeBanner();
}

