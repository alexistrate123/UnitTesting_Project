package classes;

public class Phrase {
    public static String toUpperCaseWord(String inputString) {
        String abcd;
        String upperCase = inputString.toUpperCase();
        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char c : upperCase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (newWord) {
                    result.append(Character.toUpperCase(c)); // Capitalize first letter of the word
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c)); // Convert to lowercase for the rest of the word
                }
            } else {
                result.append(c); // Keep non-letter characters unchanged
                if (c == ' ') {
                    newWord = true; // Indicates a new word will begin
                }
            }
        }

        return result.toString();
    }
}
