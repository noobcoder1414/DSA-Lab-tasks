import java.util.ArrayList;

public class DynamicArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers including some duplicate values
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Insert 20 random integers into the ArrayList
        for (int i = 0; i < 20; i++) {
            arrayList.add((int) (Math.random() * 50)); // Random integers between 0 and 49
        }

        // Print the initial ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Insert an element at the beginning of the ArrayList
        arrayList.add(0, 99);
        System.out.println("After inserting 99 at the beginning: " + arrayList);

        // Insert an element at the middle index
        int middleIndex = arrayList.size() / 2;
        arrayList.add(middleIndex, 55);
        System.out.println("After inserting 55 at the middle: " + arrayList);

        // Insert an element at the last index
        arrayList.add(arrayList.size(), 77);
        System.out.println("After inserting 77 at the last index: " + arrayList);

        // Remove the middle value
        arrayList.remove(middleIndex);
        System.out.println("After removing the middle value: " + arrayList);

        // Remove the last value
        arrayList.remove(arrayList.size() - 1);
        System.out.println("After removing the last value: " + arrayList);

        // Remove all duplicate values
        removeDuplicates(arrayList);
        System.out.println("After removing duplicates: " + arrayList);
    }

    // Method to remove all duplicate values from the ArrayList
    public static void removeDuplicates(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--; // Decrease j to recheck the shifted element
                }
            }
        }
    }
}

