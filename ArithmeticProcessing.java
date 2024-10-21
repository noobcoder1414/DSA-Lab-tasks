public class ArithmeticProcessing {
    public static void main(String[] args) {
        // Initialize arrays A and B with two-digit numbers
        int[] A = {25, 14, 12, 74, 58, 74, 98, 84, 15, 24};
        int[] B = {87, 11, 10, 81, 67, 94, 74, 82, 15, 87};
        
        // Array to hold the calculated values
        double[] C = new double[A.length];

        // Perform the arithmetic operation to create array C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + (B[i] / 100.0); // Convert B[i] to decimal and add it to A[i]
        }

        // Display the contents of array C
        System.out.println("Array C:");
        for (double value : C) {
            System.out.printf("%.2f\n", value); // Print with two decimal places
        }
    }
}
