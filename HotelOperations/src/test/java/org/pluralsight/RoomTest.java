package org.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkInTest() {
        // Arrange
        Room room = new Room(2, 150.0, false, false, true);

        // Act
        boolean result = room.checkIn();

        // Assert
        assertTrue(result, "Check-in should succeed when room is clean and unoccupied.");
        assertTrue(room.isOccupied(), "Room should be marked as occupied after check-in.");
        assertTrue(room.isDirty(), "Room should be marked as dirty after check-in.");
        assertFalse(room.isAvailable(), "Room should be marked as unavailable after check-in.");
    }

    @Test
    public void checkOutTest() {
        // Arrange
        Room room = new Room(1, 200, true, true, false);

        // Act
        boolean result = room.checkOut();

        // Assert
        assertTrue(result, "Check out should succeed when room is occupied");
        assertFalse(room.isOccupied(), "Room should be marked as unoccupied after check-out.");
        assertTrue(room.isDirty(), "Room should be marked as dirty after check-out.");
        assertFalse(room.isAvailable(), "Room should be marked as unavailable after check-out " +
                "because it is dirty.");
    }

    @Test
    public void cleanRoomTest() {
        // Arrange
        Room room = new Room(1, 200, false, true, false);

        // Act
        boolean result = room.cleanRoom();

        // Assert
        assertTrue(result, "The room was successfully cleaned");
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
}