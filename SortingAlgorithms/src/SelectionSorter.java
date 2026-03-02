import java.util.Arrays;

public class SelectionSorter {
    public static void selectionSort(short[] array) {
        if (array == null) {
            throw new NullPointerException("An array cannot be null.");
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            short temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void main() {
        System.out.println("Test Selection sort");
        short[] arr1 = {10, -5, 30, 0, 15};
        System.out.println("Before: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("After: " + Arrays.toString(arr1));

        short[] arr2 = {-10, 0, 10, 20};
        selectionSort(arr2);
        System.out.println("Sorted: " + Arrays.toString(arr2));

        short[] arr3 = {5, 2, 5, 2};
        selectionSort(arr3);
        System.out.println("Duplicates: " + Arrays.toString(arr3));

        short[] arr4 = {};
        selectionSort(arr4);
        System.out.println("Empty: " + Arrays.toString(arr4));

        try {
            selectionSort(null);
        } catch (NullPointerException e) {
            System.out.println("Null test: Exception caught: " + e.getMessage());
        }
    }
}
