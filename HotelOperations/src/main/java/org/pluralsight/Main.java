package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Hayat", "IT", 80, 50);

        employee1.punchIn(9);
        employee1.punchOut(18);

        System.out.println();

        Hotel hotel = new Hotel("The Ritz Carlton", 5, 10, 3, 6);
        hotel.bookRoom(6,true);

        System.out.println("The name of the hotel: " + hotel.getName());
        System.out.println("Booked suites: " + hotel.getBookedSuites());
        System.out.println("Booked basic rooms: " + hotel.getBookedBasicRooms());
    }
}