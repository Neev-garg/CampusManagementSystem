package com.campus.model;

/**
 * Aggregates a student's complete profile including academic metrics.
 */
public class Profile {
    private final Student student;
    private final double attendancePercentage;
    private final int javaMarks;
    private final int dsaMarks;
    private final int dbmsMarks;
    private final String feeStatus;
    private final double feeAmount;

    public Profile(Student student, double attendancePercentage,
                   int javaMarks, int dsaMarks, int dbmsMarks,
                   String feeStatus, double feeAmount) {
        this.student = student;
        this.attendancePercentage = attendancePercentage;
        this.javaMarks = javaMarks;
        this.dsaMarks = dsaMarks;
        this.dbmsMarks = dbmsMarks;
        this.feeStatus = feeStatus;
        this.feeAmount = feeAmount;
    }

    public Student getStudent() {
        return student;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public int getJavaMarks() {
        return javaMarks;
    }

    public int getDsaMarks() {
        return dsaMarks;
    }

    public int getDbmsMarks() {
        return dbmsMarks;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public void displayProfile() {
        System.out.println("\n=================================");
        System.out.println("         STUDENT PROFILE         ");
        System.out.println("=================================");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Email        : " + student.getEmail());
        System.out.println("Department   : " + student.getDepartment());
        System.out.println("Semester     : " + student.getSemester());
        System.out.printf("Attendance   : %.2f%% (%s)%n",
                attendancePercentage,
                attendancePercentage >= 75.0 ? "Gaming Hub Unlocked" : "Gaming Hub Locked");
        System.out.println("Marks        : Java=" + javaMarks + ", DSA=" + dsaMarks + ", DBMS=" + dbmsMarks);
        System.out.printf("Fee Status   : %s (Due: Rs. %.2f)%n", feeStatus, feeAmount);
        System.out.println("=================================");
    }
}

