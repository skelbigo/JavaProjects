public class ChampionshipWinners {
    public static int getNumberOfWinners(int[][] results) {
        if (results == null) {
            throw new NullPointerException("The result matrix cannot be null.");
        }

        int n = results.length;
        for (int i = 0; i < n; i++) {
            if (results[i] == null) {
                throw new NullPointerException("Matrix row " + i + " is null.");
            }
            if (results[i].length != n) {
                throw new IllegalArgumentException("The matrix must be square.");
            }
            for (int j = 0; j < n; j++) {
                int val = results[i][j];
                if (i == j && val != 0) {
                    throw new IllegalArgumentException("The elements of the main diagonal must be equal to 0..");
                }
                if (val < 0 || val > 2) {
                    throw new IllegalArgumentException("Invalid value in the matrix: " + val + ". Permitted: 0, 1, 2.");
                }
            }
        }

        int winnersCount = 0;

        for (int i = 0; i < n; i++) {
            int wins = 0;
            int losses = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (results[i][j] == 2) {
                    wins++;
                } else if (results[i][j] == 0) {
                    losses++;
                }
            }
            if (wins > losses) {
                winnersCount++;
            }
        }

        return winnersCount;
    }

    public static void main(String[] args) {
        System.out.println("Task 1: getNumberOfWinners");

        int[][] validResults = {
                {0, 2, 1},
                {0, 0, 0},
                {1, 2, 0}
        };
        System.out.println("Test 1: Expected 2, Result: " + getNumberOfWinners(validResults));

        int [][] drawResults = {
                {0, 1},
                {1, 0}
        };
        System.out.println("Test 2: Expected 0, Result: " + getNumberOfWinners(drawResults));

        try {
            int[][] nonSquare = {{0, 2}, {1, 0, 1}};
            getNumberOfWinners(nonSquare);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3 (non-square): Intercepted exception: " + e.getMessage());
        }

        try {
            int[][] invalidValue = {{0, 3}, {1, 0}};
            getNumberOfWinners(invalidValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 4: Intercepted exception: " + e.getMessage());
        }

        try {
            getNumberOfWinners(null);
        } catch (NullPointerException e) {
            System.out.println("Тест 5: Intercepted exception: " + e.getMessage());
        }
    }
}