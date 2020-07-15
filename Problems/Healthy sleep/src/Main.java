import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (isBetween(h, a, b)) {
            System.out.println("Normal");
        } else if (h < a) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }

    public static boolean isBetween(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }
}