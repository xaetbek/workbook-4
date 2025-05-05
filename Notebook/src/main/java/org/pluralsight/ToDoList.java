package org.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;


public class ToDoList {
    private ArrayList<ToDoItem> tasks = new ArrayList<>();
    private String name;
    private float progress;

    public ToDoList(String name) {
        this.name = name;
    }

    public void addItem(ToDoItem item) {
        tasks.add(item);
    }

    public void removeItem(ToDoItem item) {
        tasks.remove(item);
    }

    public void search(String keyword) {
        for (ToDoItem task : tasks) {
            if (task.getTitle().contains(keyword) || task.getDescription().contains(keyword)) {
                System.out.println("Match: " + task.getTitle());
            }
        }
    }

    public void sort(Comparator<ToDoItem> comparator) {
        tasks.sort(comparator);
    }

    public void display() {
        for (ToDoItem task : tasks) {
            System.out.println("[Task] " + task.getTitle() + ": " + task.getDescription());
        }
    }
}