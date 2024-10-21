import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingAndSearchingArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insert 20 random integers into the ArrayList
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(rand.nextInt(100)); // Random integers between 0 and 99
        }

        // Display the original list
        System.out.println("Original ArrayList: " + arrayList);

        // Sort the ArrayList using Collections.sort()
        sortArrayList(arrayList);

        // Display the sorted list
        System.out.println("Sorted ArrayList: " + arrayList);

        // Perform binary search for a random target value
        int target = arrayList.get(5); // Choosing an element from the list for demonstration
        int index = binarySearch(arrayList, target);

        // Display the search result
        if (index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }

    // Method to sort the ArrayList using Collections.sort()
    public static void sortArrayList(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList); // In-built sorting method
    }

    // Method to perform binary search using Collections.binarySearch()
    public static int binarySearch(ArrayList<Integer> arrayList, int target) {
        return Collections.binarySearch(arrayList, target); // In-built binary search method
    }
}
