import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int myNumber = scanner.nextInt() + 1;
        if (myNumber % 2 == 0) {
            System.out.println(myNumber);
        } else {
            System.out.println(myNumber + 1);
        }
    }
}