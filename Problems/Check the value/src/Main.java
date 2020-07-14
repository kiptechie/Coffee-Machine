import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int myVal = scanner.nextInt();
        System.out.println(myVal > 0 && myVal < 10);
    }
}