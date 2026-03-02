public class Task2 {

    public static void main(String[] args) {
        printResults(5, 3);
        printResults(4, 2);
        printResults(0, 1);
        printResults(-5, 2);
        printResults(4, -1);
    }

    public static double calculateFunction(int t, int l) {
        if (t <= 0) {
            throw new IllegalArgumentException("The parameter t must be a natural number (t >= 1). Result: t = " + t);
        }

        double term;
        if (l % 2 != 0) {
            term = Math.sqrt(t * l);
        } else {
            term = l / Math.sqrt(t);
        }

        return t * term;
    }

    public static void printResults(int t, int l) {
        System.out.println("t: " + t + " l: " + l + " result: ");
        try {
            System.out.println(calculateFunction(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
