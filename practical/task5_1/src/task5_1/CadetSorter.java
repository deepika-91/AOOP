package task5_1;
import java.util.List;

public class CadetSorter {
    // Method to check if the list is sorted alphabetically
    public static boolean isSorted(List<String> cadets) {
        for (int i = 0; i < cadets.size() - 1; i++) {
            if (cadets.get(i).compareTo(cadets.get(i + 1)) > 0) {
                return false; // Found a misordered pair
            }
        }
        return true; // The list is correctly sorted
    }
}

