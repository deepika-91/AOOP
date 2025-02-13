package task5_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CadetSorterTest {

    // Test Case 1: Empty list should be considered sorted
    @Test
    public void testEmptyList() {
        List<String> cadets = Collections.emptyList();
        assertTrue(CadetSorter.isSorted(cadets), "An empty list should be considered sorted.");
    }

    // Test Case 2: A single cadet should be considered sorted
    @Test
    public void testSingleCadet() {
        List<String> cadets = Arrays.asList("Aarav");
        assertTrue(CadetSorter.isSorted(cadets), "A single-element list should be sorted.");
    }

    // Test Case 3: Multiple cadets in correct order
    @Test
    public void testCorrectlySortedCadets() {
        List<String> cadets = Arrays.asList("Aarav", "Bhuvan", "Chitra", "Divya");
        assertTrue(CadetSorter.isSorted(cadets), "The list should be recognized as sorted.");
    }

    // Test Case 4: Multiple cadets in incorrect order
    @Test
    public void testUnsortedCadets() {
        List<String> cadets = Arrays.asList("Divya", "Aarav", "Chitra", "Bhuvan");
        assertFalse(CadetSorter.isSorted(cadets), "The list should be recognized as unsorted.");
    }

    // Test Case 5: Cadets with identical names should still be considered sorted
    @Test
    public void testDuplicateNames() {
        List<String> cadets = Arrays.asList("Aarav", "Aarav", "Bhuvan", "Chitra");
        assertTrue(CadetSorter.isSorted(cadets), "A list with duplicate names should be sorted.");
    }
}
