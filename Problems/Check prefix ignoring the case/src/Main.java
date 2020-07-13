import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine().toLowerCase();
        System.out.println(myStr.startsWith("j"));
    }
}