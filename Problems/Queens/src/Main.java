import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == num3) {
            System.out.println("YES");
        } else if (num2 == num4) {
            System.out.println("YES");
        } else if (Math.abs(num1 - num3) == Math.abs(num2 - num4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}