import java.util.Scanner;

class Main {

    private static boolean isWeekend;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        isWeekend = scanner.nextBoolean();
        System.out.println(isBetween(cups));
    }

    public static boolean isBetween(int i) {
        if (isWeekend) {
            return i >= 15 && i <= 25;
        } else {
            return i >= 10 && i <= 20;
        }
    }
}