import java.util.Arrays;

public class InsertionSorter {
    public static void insertionSort(short[] array) {
        if (array == null) {
            throw new NullPointerException("An array cannot be null.");
        }

        for (int i = 1; i < array.length; i++) {
            short key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nTest Insertion Sort ===");

        short[] arr1 = {45, 12, -3, 8, 12};
        System.out.println("Before:    " + Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println("After: " + Arrays.toString(arr1));

        short[] arr2 = {100, 50, 0, -50};
        System.out.println("Reverse to: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("Reverse after: " + Arrays.toString(arr2));

        short[] arr3 = {42};
        insertionSort(arr3);
        System.out.println("One element: " + Arrays.toString(arr3));

        try {
            insertionSort(null);
        } catch (NullPointerException e) {
            System.out.println("Null test: Exception caught: " + e.getMessage());
        }
    }
}
