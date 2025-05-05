package org.pluralsight;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Notepad App");

        NoteManager noteManager = new NoteManager();
        Note note = new Note(1, "MMK", "Zoom meeting", LocalDate.of(2024, 5, 5), "WBE Survey");
        noteManager.addNote(note);
    }
}