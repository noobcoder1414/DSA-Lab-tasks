public class SimpleSearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (works only on a sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Manually creating a dataset
        int n = 100000;
        int[] unsortedArray = {8, 3, 7, 1, 2, 5, 6, 4, 10, 9};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Target to search
        int target = 5;

        // Linear Search on unsorted array
        long startTime = System.nanoTime();
        int resultLinearUnsorted = linearSearch(unsortedArray, target);
        long endTime = System.nanoTime();
        long durationLinearUnsorted = endTime - startTime;
        System.out.println("Linear Search (Unsorted) - Time: " + durationLinearUnsorted + " ns, Result: " + resultLinearUnsorted);

        // Linear Search on sorted array
        startTime = System.nanoTime();
        int resultLinearSorted = linearSearch(sortedArray, target);
        endTime = System.nanoTime();
        long durationLinearSorted = endTime - startTime;
        System.out.println("Linear Search (Sorted) - Time: " + durationLinearSorted + " ns, Result: " + resultLinearSorted);

        // Binary Search on sorted array
        startTime = System.nanoTime();
        int resultBinarySorted = binarySearch(sortedArray, target);
        endTime = System.nanoTime();
        long durationBinarySorted = endTime - startTime;
        System.out.println("Binary Search (Sorted) - Time: " + durationBinarySorted + " ns, Result: " + resultBinarySorted);
    }
}
