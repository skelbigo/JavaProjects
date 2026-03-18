import java.util.Arrays;

class Task1 {
    public static void main() {
        printResults("The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago");
    }

    public static int countIntegers(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The row can not be null");
        }
        int count = 0;
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            boolean isNumber = true;
            for (char c : word.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                count++;
            }
        }
        return count;
    }

    public static void printResults(String str) {
        System.out.println(str);
        try {
            System.out.println("Result = " + countIntegers(str));
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}