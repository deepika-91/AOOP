package Module1C;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    @Test
    void testReverseRegularString() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, StringReverser.reverse(input));
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, StringReverser.reverse(input));
    }

    @Test
    void testReverseStringWithSpecialCharacters() {
        String input = "h@ll0!";
        String expected = "!0ll@h";
        assertEquals(expected, StringReverser.reverse(input));
    }

    @Test
    void testReverseNullInput() {
        assertNull(StringReverser.reverse(null));
    }
}
