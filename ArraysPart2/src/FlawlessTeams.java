import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlawlessTeams {
    public static int[] getFlawless(int[][] results) {
        if (results == null) {
            throw new NullPointerException("The result matrix cannot be null.");
        }

        int n = results.length;
        for (int i = 0; i < n; i++) {
            if (results[i] == null) throw new NullPointerException("String " + i + " is null.");
            if (results[i].length != n) throw new IllegalArgumentException("The matrix must be square.");

            for (int j = 0; j < n; j++) {
                if (i == j && results[i][j] != 0)
                    throw new IllegalArgumentException("The diagonal should be 0.");
                if (results[i][j] < 0 || results[i][j] > 2)
                    throw new IllegalArgumentException("Invalid value: " + results[i][j]);
            }
        }

        List<Integer> flawlessIndices = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean hasLoss = false;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (results[i][j] == 0) {
                    hasLoss = true;
                    break;
                }
            }
            if (!hasLoss) {
                flawlessIndices.add(i);
            }
        }

        int[] result = new int[flawlessIndices.size()];
        for (int i = 0; i < flawlessIndices.size(); i++) {
            result[i] = flawlessIndices.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\nTest2: getFlawless");

        int[][] matrix1 = {
                {0, 2, 1},
                {0, 0, 1},
                {1, 1, 0}
        };
        int[] result1 = getFlawless(matrix1);
        System.out.println("Test 1: Expected [0, 2], Result: " + Arrays.toString(result1));

        int[][] matrix2 = {
                {0, 0},
                {0, 0}
        };
        System.out.println("Test 2: Expected [], Result: " + Arrays.toString(getFlawless(matrix2)));

        try {
            int[][] badDiagonal = {{1, 2}, {1, 0}};
            getFlawless(badDiagonal);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3 (poor diagonal): Intercepted: " + e.getMessage());
        }

        try {
            int[][] jagged = {{0, 1}, null};
            getFlawless(jagged);
        } catch (NullPointerException e) {
            System.out.println("Test 4 (null string): Intercepted: " + e.getMessage());
        }
    }
}
