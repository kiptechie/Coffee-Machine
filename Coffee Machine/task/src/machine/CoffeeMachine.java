package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write how many ml of water the coffee machine has:");
    int water = sc.nextInt();
    System.out.println("Write how many ml of milk the coffee machine has:");
    int milk = sc.nextInt();
    System.out.println("Write how many grams of coffee beans the coffee machine has:");
    int coffeeeBeans = sc.nextInt();
    System.out.println("Write how many cups of coffee you will need:");
    int needCups = sc.nextInt();

    int makeableCups = getCupOfCoffee(water, milk, coffeeeBeans, 0);

    if (makeableCups - needCups >= 0) {
      yes(makeableCups, needCups);
    } else {
      no(makeableCups, needCups);
    }
  }

  private static int getCupOfCoffee(int water, int milk, int beans, int cups) {
    if (water < 200 || milk < 50 || beans < 15) {
      return cups;
    }
    water -= 200;
    milk -= 50;
    beans -= 15;
    cups += 1;
    return getCupOfCoffee(water, milk, beans, cups);
  }

  private static void yes(int makeableCups, int needCups) {
    int diff = makeableCups - needCups;
    if (diff == 0) {
      System.out.println("Yes, I can make that amount of coffee");
    }
    if (diff > 0) {
      System.out.println(String.format("Yes, I can make that amount of coffee (and even %d more than that)", diff));
    }
  }

  private static void no(int makeableCups, int needCups) {
    int over = needCups - makeableCups;
    if (over > 0) {
      System.out.println(String.format("No, I can make only %d cup(s) of coffee", makeableCups));
    }
  }
}
