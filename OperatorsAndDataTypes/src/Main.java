void main() {
    task1();
    task2();
    task3();
}

public static void task1() {
    System.out.println("Task 1");
    double a = -2.98;
    double b = 5.55;
    double c = 0.045;
    double d = 0.129;

    double numerator = Math.sin(Math.abs(a)) + Math.cos(Math.sqrt(b));
    double denominator = 2 * Math.tan(c) + Math.exp(d);
    double y = numerator / denominator;

    System.out.printf("Input data: a=%.3f, b=%.3f, c=%.3f, d=%.3f%n", a, b, c, d);
    System.out.println("Result y = " + y);
    System.out.println();
}

public static void task2() {
    System.out.println("Task 2");
    double a = 1.234;
    double b = -3.12;
    double c = 5.45;
    double d = 2.0;

    double numerator = Math.pow(Math.tan(a), 1.0 / c);
    double denominator = 1 + (Math.sinh(b) / Math.log(Math.abs(d + c)));
    double y = numerator / denominator;

    System.out.printf("Input data: a=%.3f, b=%.3f, c=%.3f, d=%.3f%n", a, b, c, d);
    System.out.println("Result y = " + y);
    System.out.println();
}

public static void task3() {
    System.out.println("Task 3");
    double a = -2.86;
    double b = 1.62;
    double c = 10.874;
    double d = 2.91;

    double asinhD = Math.log(d + Math.sqrt(d * d + 1));

    double sqrtPart = Math.sqrt(Math.abs(a / b));

    double base = 2 * Math.cos(sqrtPart) + 4 * asinhD;
    double y = Math.pow(base, c);

    System.out.printf("Input data: a=%.3f, b=%.3f, c=%.3f, d=%.3f%n", a, b, c, d);
    System.out.println("Result y = " + y);
}
