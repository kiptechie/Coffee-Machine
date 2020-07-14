import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;

        boolean exactlyOneIsPositive =
                onlyFirstIsPositive ||
                        onlySecondIsPositive ||
                        onlyThirdIsPositive;

        System.out.println(exactlyOneIsPositive);
    }
}