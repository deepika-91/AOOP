package Module1C;
public class Main {

    public static void main(String[] args) {
        // Test 1: Regular string
        String input1 = "hello";
        System.out.println("Original: " + input1);
        System.out.println("Reversed: " + StringReverser.reverse(input1));

        // Test 2: Empty string
        String input2 = "";
        System.out.println("Original: " + input2);
        System.out.println("Reversed: " + StringReverser.reverse(input2));

        // Test 3: String with special characters
        String input3 = "h@ll0!";
        System.out.println("Original: " + input3);
        System.out.println("Reversed: " + StringReverser.reverse(input3));

        // Test 4: Null input
        String input4 = null;
        System.out.println("Original: " + input4);
        System.out.println("Reversed: " + StringReverser.reverse(input4));
    }
}
