package org.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchInTest() {
        // Arrange
        Employee employee = new Employee(1, "Adam", "IT", 80, 0);

        // Act
        employee.punchIn(9);
        employee.punchOut(19);

        // Assert
        assertEquals(10, employee.getHoursWorked(), 0.01, "Employee should have worked 10 hours");
    }

    @Test
    public void punchOutTest() {
        // Arrange
        Employee employee = new Employee(1, "Adam", "IT", 80, 0);

        // Act
        employee.punchOut(17.0);  // Should do nothing since not clocked in

        // Assert
        assertEquals(0.0, employee.getHoursWorked(), 0.01,
                "Hours worked should remain 0 if not clocked in");
    }
}