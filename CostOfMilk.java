import java.util.Scanner;

public class CostOfMilk {
  public static void main (String[] args) {

    // Create an instance of SCANNER
    Scanner scanner = new Scanner(System.in);

    // Get the 'numOfGallons' from the user
    System.out.println("Enter the number of gallons you are purchasing:");
    int numOfGallons = scanner.nextInt();
    System.out.println();

    if (numOfGallons <= 6){
    System.out.println("The total cost of the milk is $" + (2.09 * numOfGallons));
    } else {    
    System.out.println("The total cost of the milk is $" + ((2.09 * 6) + 1.99 * (numOfGallons - 6)));
    }
    scanner.close();
  }
}