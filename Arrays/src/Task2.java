import java.util.Arrays;

public class Task2 {

    public static long getProductOfMaxMinAbs(int[] array) {
        if (array == null) {
            throw new NullPointerException("The array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("An array cannot be empty");
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        return (long) Math.abs(max) * Math.abs(min);
    }

    public static void main(String[] args) {
        System.out.println("Test2");

        int[] arr1 = {2, 10, -5, 20 ,3};
        System.out.println("Array: " + Arrays.toString(arr1) + " -> Result: " + getProductOfMaxMinAbs(arr1));

        int[] arr2 = {-10, 5, -2};
        System.out.println("Масив: " + Arrays.toString(arr2) + " -> Результат: " + getProductOfMaxMinAbs(arr2));

        try {
            System.out.print("Test with an empty array: ");
            getProductOfMaxMinAbs(new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Виключення: " + e.getMessage());
        }
    }
}
