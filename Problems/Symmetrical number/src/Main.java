import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isSymmetric(num)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }

    public static boolean isSymmetric(long number) {
        if (number == 0) {
            return true;
        } else if (number < 0) {
            return false;
        }

        long dDEG_10 = (long)(Math.pow(10, (int)Math.log10(number)));

        while (number > 0) {
            long dStart = number / dDEG_10;
            long dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * dDEG_10 - dEnd) / 10;
            dDEG_10 /= 100;
        }

        return true;
    }
}