package org.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

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

    public void checkIn() {
        if(!isOccupied && !isDirty && isAvailable) {
            isOccupied = true;
            isDirty = true;
            isAvailable = false;
            System.out.println("Guest has checked in.");
        } else {
            System.out.println("Room is not ready for check-in.");
        }
    }

    public void checkOut() {
        if(isOccupied) {
            isOccupied = false;
            isDirty = true;
            isAvailable = false;
            System.out.println("Guest has checked out. Room is now dirty.");
        } else {
            System.out.println("The room is already unoccupied.");
        }
    }

    public void cleanRoom() {
        if(!isOccupied && isDirty){
            isDirty = false;
            isAvailable = true;
            System.out.println("Room has been cleaned and is available.");
        } else if (isOccupied) {
            System.out.println("Can't clean room while it's occupied.");
        } else {
            System.out.println("Room is already clean.");
        }
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
