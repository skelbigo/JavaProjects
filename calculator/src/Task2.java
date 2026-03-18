import java.util.Arrays;

public class Task2 {
    public static void main() {
        printResults(14);
    }

    public static String intToBinaryString(int i) {
        if (i == 0) { return "0"; }
        StringBuilder builder = new StringBuilder("");

        while (i > 0) {
            int surplus = i % 2;
            builder.append(surplus);
            i = i / 2;
        }

        return builder.reverse().toString();
    }

    public static void printResults(int i) {
        System.out.println(i);
        String result = intToBinaryString(i);
        try {
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
