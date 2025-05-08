package org.pluralsight;

public class NameFormatter {
    private NameFormatter() {} // Private constructor to prevent instantiation

    // Format: LastName, FirstName
    public static String format(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }

    // Format: LastName, Prefix FirstName MiddleName, Suffix
    public static String format(String prefix, String firstName,
                                String middleName, String lastName, String suffix) {
        StringBuilder formattedName = new StringBuilder();
        formattedName.append(lastName).append(", ");

        if (prefix != null && !prefix.isEmpty()) {
            formattedName.append(prefix).append(" ");
        }

        formattedName.append(firstName);

        if (middleName != null && !middleName.isEmpty()) {
            formattedName.append(" ").append(middleName);
        }

        if (suffix != null && !suffix.isEmpty()) {
            formattedName.append(", ").append(suffix);
        }

        return formattedName.toString();
    }

    public static String format(String fullName) {
        String suffix = "";
        String namePart = fullName;

        // Handle suffix if present
        if (fullName.contains(",")) {
            String[] parts = fullName.split(", ");
            namePart = parts[0];
            suffix = parts.length > 1 ? parts[1] : "";
        }

        String[] tokens = namePart.split(" ");
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // Check for prefix (has a dot)
        if (tokens.length > 0 && tokens[0].contains(".")) {
            prefix = tokens[0];
            // Remove prefix from tokens
            String[] remainingTokens = new String[tokens.length - 1];
            System.arraycopy(tokens, 1, remainingTokens, 0, remainingTokens.length);
            tokens = remainingTokens;
        }

        if (tokens.length >= 1) {
            lastName = tokens[tokens.length - 1];
        }

        if (tokens.length >= 2) {
            firstName = tokens[0];
        }

        if (tokens.length >= 3) {
            middleName = tokens[1];
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }
}