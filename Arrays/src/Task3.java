import java.util.Arrays;

public class Task3 {
    public static double[] transformArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("An array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("An array cannot be empty");
        }

        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        double[] result = new double[array.length];
        if (min == 0) {
            for (int i = 0; i < array.length; i++) {
                result[i] = -10.0;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                result[i] = (double) array[i] / min;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\nTest3");

        int[] arr1 = {2, 4, 6};
        System.out.println("Input: " + Arrays.toString(arr1) + " -> Output: " + Arrays.toString(transformArray(arr1)));

        int[] arr2 = {5, 0, 10};
        System.out.println("Input: " + Arrays.toString(arr2) + " -> Output: " + Arrays.toString(transformArray(arr2)));

        int[] arr3 = {-2, 4, 8};
        System.out.println("Input: " + Arrays.toString(arr3) + " -> Output: " + Arrays.toString(transformArray(arr3)));

        try {
            transformArray(null);
        } catch (NullPointerException e) {
            System.out.println("Test null successful: " + e.getMessage());
        }
    }
}
