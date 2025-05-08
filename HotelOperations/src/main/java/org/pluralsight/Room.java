package org.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false; // Rooms are clean by default
        this.isAvailable = true; // Rooms are available by default
    }

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }


    public Room() {
        this.numberOfBeds = 0;
        this.price = 0.0;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public boolean checkIn() {
        if(!isOccupied && !isDirty && isAvailable) {
            isOccupied = true;
            isDirty = true;
            isAvailable = false;
            System.out.println("Guest has checked in.");
            return true;
        } else {
            System.out.println("Room is not ready for check-in.");
            return false;
        }
    }

    public boolean checkOut() {
        if(isOccupied) {
            isOccupied = false;
            isDirty = true;
            isAvailable = false;
            System.out.println("Guest has checked out. Room is now dirty.");
            return true;
        } else {
            System.out.println("The room is already unoccupied.");
            return false;
        }
    }

    public boolean cleanRoom() {
        if(!isOccupied && isDirty){
            isDirty = false;        // Clean the room
            isAvailable = true;     // Mark the room available
            System.out.println("Room has been cleaned and is available.");
            return true;
        } else if (isOccupied) {
            System.out.println("Can't clean room while it's occupied.");
        } else {
            System.out.println("Room is already clean.");
        }
        return false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
