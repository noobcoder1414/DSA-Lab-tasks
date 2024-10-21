public class DynamicArray {
    private int[] data;
    private int size; // Current number of elements

    // Constructor to initialize the array with a given capacity
    public DynamicArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // Method to insert an element into the array
    public void insert(int element) {
        if (size == data.length) {
            // Resize array if it's full (double the size)
            resizeArray();
        }
        data[size] = element;
        size++;
    }

    // Method to remove an element at a given index
    public void remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--; // Reduce the size
    }

    // Method to find the index of a given element
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Method to update an element at a given index
    public void update(int index, int element) {
        if (index >= size || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        data[index] = element;
    }

    // Method to resize the array when it's full
    private void resizeArray() {
        int[] newData = new int[data.length * 2]; // Double the capacity
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData; // Point to the new array
    }

    // Method to display the array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage of the DynamicArray class
        DynamicArray ar = new DynamicArray(5);

        // Insert elements
        ar.insert(10);
        ar.insert(20);
        ar.insert(30);
        ar.insert(40);
        ar.insert(50);
        ar.display(); // Output: 10 20 30 40 50

        // Remove element at index 2
        ar.remove(2);
        ar.display(); // Output: 10 20 40 50

        // Find index of element 40
        int index = ar.indexOf(40);
        System.out.println("Index of 40: " + index); // Output: Index of 40: 2

        // Update element at index 1
        ar.update(1, 25);
        ar.display(); // Output: 10 25 40 50
    }
}
