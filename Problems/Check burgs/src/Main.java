import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String myCity = scanner.nextLine();
        String trimmedString = myCity.replaceAll("\\s+", "");
        String toLowerCase = trimmedString.toLowerCase();
        boolean myLength = toLowerCase.length() < 4;
        if (!myLength) {
            System.out.println(toLowerCase.endsWith("burg"));
        } else {
            System.out.println(false);
        }
    }
}