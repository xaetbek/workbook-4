package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Hayat", "IT", 80, 50);

        employee1.punchIn(9);
        employee1.punchOut(18);
    }
}