package org.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites , int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRoomsToBook, boolean isSuite) {
        if (isSuite) {
            if (numberOfRoomsToBook <= getAvailableSuites()) {
                bookedSuites += numberOfRoomsToBook;
                return true;
            } else {
                return false;
            }
        }
        else {
            if (numberOfRoomsToBook <= getAvailableRooms()) {
                bookedBasicRooms += numberOfRoomsToBook;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }

    // Optional getters for testing/debugging
    public String getName() {
        return name;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
