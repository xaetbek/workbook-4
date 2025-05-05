package org.pluralsight;

import java.time.Duration;
import java.time.LocalDate;

// ✅ Class: ToDoItem extends Note
public class ToDoItem extends Note {
    private boolean isCompleted;
    private LocalDate dueDate;
    private String priority;
    private Duration timer;

    public ToDoItem(int id, String title, String description, LocalDate dateCreated, String subject,
                    boolean isCompleted, LocalDate dueDate, String priority) {
        super(id, title, description, dateCreated, subject);
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getters and Setters
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public Duration getTimer() { return timer; }
    public void setTimer(Duration duration) { this.timer = duration; }

    // Additional Methods
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void updateDescription(String newDescription) {
        setDescription(newDescription);
    }

    public void updateTitle(String newTitle) {
        setTitle(newTitle);
    }

    public void clearItem() {
        setTitle("");
        setDescription("");
        this.isCompleted = false;
        this.dueDate = null;
        this.priority = null;
        this.timer = null;
    }
}