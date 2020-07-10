import java.util.Scanner;

class Main {

    static int reversDigits(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int myNum = scanner.nextInt();
        System.out.println(reversDigits(myNum));
    }
}