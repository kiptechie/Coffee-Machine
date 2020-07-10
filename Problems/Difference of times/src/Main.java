import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();
        int myDiff = second2 - second1;
        int myDiff1 = minute2 * 60 - minute1 * 60;
        int myDiff3 = hour2 * 3600 - hour1 * 3600;
        int totalDiff = myDiff + myDiff1 + myDiff3;
        System.out.println(totalDiff);
    }
}