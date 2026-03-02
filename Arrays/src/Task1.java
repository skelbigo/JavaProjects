import java.util.Arrays;

public class Task1 {

    public static int countZeros(int[] array) {
        if (array == null) {
            throw new NullPointerException("The array cannot be null");
        }

        int count = 0;
        for (int element : array) {
            if (element == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Task1");

        int[][] testArrays = {
                {0, 5, 0, -3, 0, 10},
                {1, 2, 3, 4, 5},
                {},
                {0, 0, 0}
        };

        for (int[] test : testArrays) {
            System.out.println("Array: " + Arrays.toString(test) +
                    " -> Number of zeros: " + countZeros(test));
        }

        try {
            System.out.print("Test with null: ");
            countZeros(null);
        } catch (NullPointerException e) {
            System.out.println("Exceptions: " + e.getMessage());
        }
    }
}