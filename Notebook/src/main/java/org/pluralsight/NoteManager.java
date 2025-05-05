package org.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 🗃️ Class: NoteManager
public class NoteManager {
    private ArrayList<Note> notes = new ArrayList<>();
    private ArrayList<ToDoItem> todos = new ArrayList<>();
    private ArrayList<Note> history = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public void deleteNote(int id) {
        notes.removeIf(note -> note.getId() == id);
    }

    public void editNote(int id, String newContent) {
        for (Note note : notes) {
            if (note.getId() == id) {
                note.setDescription(newContent);
                break;
            }
        }
    }

    public void displayAllNotes() {
        for (Note note : notes) {
            System.out.println("[Note] " + note.getTitle() + ": " + note.getDescription());
        }
        for (ToDoItem todo : todos) {
            System.out.println("[ToDo] " + todo.getTitle() + ": " + todo.getDescription());
        }
    }

    public void sortNotes(Comparator<Note> comparator) {
        notes.sort(comparator);
    }

    public List<Note> search(String keyword) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getTitle().contains(keyword) || note.getDescription().contains(keyword)) {
                result.add(note);
            }
        }
        return result;
    }

    public List<Note> filterBySubject(String subject) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getSubject().equalsIgnoreCase(subject)) {
                result.add(note);
            }
        }
        return result;
    }

    public List<Note> filterByDate(LocalDate date) {
        List<Note> result = new ArrayList<>();
        for (Note note : notes) {
            if (note.getDateCreated().equals(date)) {
                result.add(note);
            }
        }
        return result;
    }
}