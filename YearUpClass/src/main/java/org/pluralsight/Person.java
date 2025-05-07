package org.pluralsight;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    // Empty constructor to extend from Student class
    public Person () {
    }
    // Constructor
    public Person(String firstName, String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return getFirstName() + " " + getLastName();
    }

    // Getters en Setters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }
}
