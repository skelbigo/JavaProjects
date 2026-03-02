public class Task1 {

    public static void main(String[] args) {
        printResults(10, 5.0);
        printResults(1, 1.0);
        printResults(34, 10.0);
        printResults(40, 5.0);
        printResults(0, 5.0);
        printResults(10, -1.0);
        printResults(10, Double.NaN);
    }

    public static double calculateSeries(int k, double s) {
        if (k < 1 || k >=35) {
            throw new IllegalArgumentException("The parameter k must be within the range [1, 34]. Result: k = " + k);
        }
        if (s <= 0) {
            throw new IllegalArgumentException("The parameter s must be greater than 0 to calculate the logarithm. Result: s = " + s);
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.log10(Math.sqrt(s * (1.0 / (i * i))));
        }
        return sum;
    }

    static void printResults(int k, double s) {
        System.out.print("k: " + k + " s: " + s + " result: ");
        try {
            System.out.println(calculateSeries(k, s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}