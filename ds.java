
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define and initialize variables
        int size = 5;   // Current size of the array
        int pos = 3;    // Position where you want to insert the new value (1-based)
        int newval = 99; // The new value to insert

        // Initialize the array with a size large enough to accommodate the new element
        int[] num = new int[10];  // Array size set to 10 (can be adjusted)

        // Fill the array with some initial values for testing
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;

        // Shift elements to the right to make space for the new value
        for (int n = size; n >= pos; n--) {
            num[n] = num[n - 1];
        }

        // Insert the new value at the specified position
        num[pos - 1] = newval;

        // Increase the size since we added a new element
        size++;

        // Print the updated array
        System.out.println(Arrays.toString(num));
    }
}
