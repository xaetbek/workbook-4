package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a generic person
        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

        Student student = new Student(
                101,                                    // ID
                "Hayat",                                   // First name
                "Azimov",                                   // Last name
                "kazimov@my.yearupunited.org",              // Email
                "male",                                     // Gender
                "https://github.com/xaetbek",                // GitHub link
                "https://www.linkedin.com/in/hayat-azimov/", // LinkedIn profile
                "BarlasTheEmperor",                          // Coding nickname
                "0",                                        // Codewars XP (as String)
                "https://media.licdn.com/dms/image/v2/D5603AQFOaKmm1-golA/profile-displayphoto-shrink_400_400/B56ZP9Da2mHIAg-/0/1735117352643?e=1752105600&v=beta&t=VER14eaR0usAksGXzlym9OegBpDFH6J2UB7zICqnRVA",              // Image URL
                "MacBook",                                  // Device type
                80,                                           // Workbook page number
                "81"                                          // Currently working on (page/task)
        );

        // Print information about the student
        System.out.println("Student:");
        System.out.println("Full Name: " + student.getName());
        System.out.println("Nickname: " + student.getCodingNickname());
        System.out.println("GitHub: " + student.getGithub());
        System.out.println("LinkedIn: " + student.getLinkedIn());
//        System.out.println("Image URL: " + student.getImageUrl());
        System.out.println("Coding Nickname: " + student.getCodingNickname());
        System.out.println("Device: " + student.getDeviceType());
        System.out.println("Currently Working On: " + student.getCurrentlyWorkingOn());
    }
}