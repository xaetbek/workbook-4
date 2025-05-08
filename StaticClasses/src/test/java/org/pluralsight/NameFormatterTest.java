package org.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    // Test format(String firstName, String lastName)
    @Test
    void formatFirstLast_ShouldReturnLastNameCommaFirstName() {
        // Arrange
        String firstName = "John";
        String lastName = "Doe";

        // Act
        String result = NameFormatter.format(firstName, lastName);

        // Assert
        assertEquals("Doe, John", result);
    }

    // Test format(String prefix, String firstName, String middleName, String lastName, String suffix)
    @Test
    void formatAllComponents_ShouldReturnFormattedString() {
        // Arrange
        String prefix = "Dr.";
        String firstName = "Jane";
        String middleName = "A";
        String lastName = "Smith";
        String suffix = "PhD";

        // Act
        String result = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // Assert
        assertEquals("Smith, Dr. Jane A, PhD", result);
    }

    @Test
    void formatAllComponents_NoMiddleName_ShouldOmitMiddle() {
        // Arrange
        String prefix = "Mr.";
        String firstName = "Robert";
        String middleName = "";
        String lastName = "Johnson";
        String suffix = "Jr";

        // Act
        String result = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // Assert
        assertEquals("Johnson, Mr. Robert, Jr", result);
    }

    // Test format(String fullName)
    @Test
    void parseFullName_WithPrefixAndSuffix_ShouldFormatCorrectly() {
        // Arrange
        String fullName = "Dr. Emily Rose Parker, MD";

        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals("Parker, Dr. Emily Rose, MD", result);
    }

    @Test
    void parseFullName_NoPrefixWithSuffix_ShouldFormatCorrectly() {
        // Arrange
        String fullName = "Michael James Williams, III";

        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals("Williams, Michael James, III", result);
    }

    @Test
    void parseFullName_SimpleName_ShouldFormatCorrectly() {
        // Arrange
        String fullName = "David Lee";

        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals("Lee, David", result);
    }

    @Test
    void parseFullName_WithPrefixNoSuffix_ShouldFormatCorrectly() {
        // Arrange
        String fullName = "Prof. Alan Turing";

        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals("Turing, Prof. Alan", result);
    }

    @Test
    void parseFullName_WithMiddleNoSuffix_ShouldFormatCorrectly() {
        // Arrange
        String fullName = "Grace Murray Hopper";

        // Act
        String result = NameFormatter.format(fullName);

        // Assert
        assertEquals("Hopper, Grace Murray", result);
    }
}