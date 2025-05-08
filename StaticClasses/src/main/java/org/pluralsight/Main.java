package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println(NameFormatter.format("Mel", "Johnson"));
        // Output: "Johnson, Mel"

        System.out.println(NameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD"));
        // Output: "Johnson, Dr. Mel B, PhD"

        System.out.println(NameFormatter.format("Dr. Mel B Johnson, PhD"));
        // Output: "Johnson, Dr. Mel B, PhD"

        System.out.println(NameFormatter.format("Mel B Johnson, PhD"));
        // Output: "Johnson, Mel B, PhD"

        System.out.println(NameFormatter.format("Mel Johnson"));
        // Output: "Johnson, Mel"
    }
}