package com.campus.exception;

/**
 * Thrown when a student with attendance below 75% tries to access the Gaming Hub.
 */
public class GamingLockedException extends CampusException {

    private final double currentAttendance;

    public GamingLockedException(double currentAttendance) {
        super("Attendance below 75%\n\nGaming Hub Locked\nImprove attendance to access games.");
        this.currentAttendance = currentAttendance;
    }

    public double getCurrentAttendance() {
        return currentAttendance;
    }
}

