package classes;

public class Word {
    public static String reverseWord() {
        String word = "car";
        return new StringBuilder(word).reverse().toString();
    }
}
