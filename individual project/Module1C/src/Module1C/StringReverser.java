package Module1C;

public class StringReverser {
    
    /**
     * Reverses the given string.
     * 
     * @param input the string to reverse
     * @return the reversed string, or null if the input is null
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}

