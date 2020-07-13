import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt() + 1;
        System.out.println(myString.substring(firstNum, secondNum));
    }
}