import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}