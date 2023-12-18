import java.util.Scanner;
public class Taxes{
  public static void main(String[] args){
    double income = userIncome();

    int bracket = findIncomeBracket(income);

    double amountOwed = calculateAmount(income);

    System.out.println();

    System.out.println("Income Bracket " + bracket);
    System.out.println("You owe $" + amountOwed + " in Federal taxes.");
  }

  public static double userIncome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your yearly income:");
    double income = sc.nextDouble();
    sc.close();
    return income;
  }

  public static int findIncomeBracket(double income) {
    if (income < 50000) {
      return 1;
    } else if (income >= 50000 && income <= 99999.99) {
      return 2;
    } else {
      return 3;
    }
  }

public static double calculateAmount(double income) {
  double taxRate = 0.15;
  return Math.round(income * taxRate * 100) / 100.0;
}

}
