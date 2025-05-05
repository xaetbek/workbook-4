package org.pluralsight;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 🧱 Base Class: Note
public class Note {
    private int id;
    private String title;
    private String description;
    private LocalDate dateCreated;
    private String subject;

    public Note(int id, String title, String description, LocalDate dateCreated, String subject) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.subject = subject;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDateCreated() { return dateCreated; }
    public void setDateCreated(LocalDate dateCreated) { this.dateCreated = dateCreated; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}