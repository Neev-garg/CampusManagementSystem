package com.campus.model;

/**
 * Represents a Student user and their academic identity.
 * Demonstrates Inheritance, Encapsulation, and Polymorphism.
 */
public class Student extends User {
    private int studentId;
    private String name;
    private String email;
    private String department;
    private int semester;

    public Student() {
        setRole("STUDENT");
    }

    public Student(int userId, String username, String password,
                   int studentId, String name, String email, String department, int semester) {
        super(userId, username, password, "STUDENT");
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.semester = semester;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void displayWelcomeBanner() {
        System.out.println("Welcome, " + name + " (" + department + " - Sem " + semester + ")!");
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-18s | Email: %-22s | Dept: %-16s | Sem: %d",
                studentId, name, email, department, semester);
    }
}

