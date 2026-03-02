public class Task3 {
    public static void main(String[] args) {
        printResults(0.0001);
        printResults(1e-7);
        printResults(0.0);
        printResults(-0.1);
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("The precision epsilon must be strictly greater than 0.");
        }

        double sum = 0;
        double currentTerm;
        int i = 1;

        currentTerm = -1.0;

        while (Math.abs(currentTerm) >= epsilon) {
            sum += currentTerm;
            i++;
            currentTerm = currentTerm * (-1.0 / i);

            if (i > 1000000) break;
        }

        return sum;
    }

    static void printResults(double eps) {
        System.out.print("epsilon: " + eps + " result: ");
        try {
            System.out.println(calculateInfiniteSum(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
