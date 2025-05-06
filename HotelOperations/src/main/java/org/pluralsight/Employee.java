package org.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean isClockedIn = false;
    private LocalDateTime startDateTime; // Changed to LocalDateTime for consistency

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public void punchIn(double time) {
        if (!isClockedIn) {
            startDateTime = LocalDate.now().atStartOfDay().plusMinutes((long)(time * 60));
            isClockedIn = true;
            System.out.println(name + " punched in at " + time);
        } else {
            System.out.println(name + " is already punched in.");
        }
    }

    public void punchOut(double time) {
        if (isClockedIn && startDateTime != null) {
            LocalDateTime endDateTime = LocalDate.now().atStartOfDay().plusMinutes((long)(time * 60));
            Duration duration = Duration.between(startDateTime, endDateTime);
            double workedHours = duration.toMinutes() / 60.0;
            if (workedHours > 0) {
                hoursWorked += workedHours;
                System.out.println(name + " punched out at " + time + ", worked " + workedHours + " hours.");
            } else {
                System.out.println("Invalid time: punch out must be after punch in.");
            }
            isClockedIn = false;
            startDateTime = null;
        } else {
            System.out.println(name + " hasn't punched in yet.");
        }
    }

    public void punchIn() {
        if (!isClockedIn) {
            startDateTime = LocalDateTime.now();
            isClockedIn = true;
            System.out.println("Employee " + name + " clocked in at " + startDateTime);
        } else {
            System.out.println("Already clocked in.");
        }
    }

    public void punchOut() {
        if (isClockedIn && startDateTime != null) {
            LocalDateTime endTime = LocalDateTime.now();
            Duration duration = Duration.between(startDateTime, endTime);
            double hours = duration.toMinutes() / 60.0;
            hoursWorked += hours;
            isClockedIn = false;
            startDateTime = null;
            System.out.println("Clocked out at " + endTime + ". Worked " + String.format("%.2f", hours) + " hours.");
        } else {
            System.out.println("Not clocked in.");
        }
    }

    // Derived getters
    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    } // End of derived getters


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
