import java.util.Scanner;
 public class MadLibs {
    public static void main (String[] args) {

        wordStory();

    }
    public static void wordStory(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a verb:");
        String verb1 = scanner.nextLine();

        System.out.println();

        System.out.println("Please enter a noun:");
        String noun1 = scanner.nextLine();

        System.out.println();

        System.out.println("Please enter a name:");
        String name = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a store name:");
        String storeName = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a emotion:");
        String emotion = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a noun:");
        String noun2 = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a verb:");
        String verb2 = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a color:");
        String color = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a adverb:");
        String adverb = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a adjective:");
        String adjective = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a number:");
        String num = scanner.nextLine();
        
        System.out.println();

        System.out.println("Please enter a noun:");
        String noun3 = scanner.nextLine();
        
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("=================================================");
        System.out.println("The Enchanted Adventure");
        System.out.println("=================================================");

        System.out.println();
        
        System.out.println("Once upon a time, in a quaint village, there was a person named " + name + ". ");
        System.out.println(name + " had a deep love for " + verb1 + ", particularly around the area near the " + storeName + ". ");
        System.out.println("One day, while " + verb2 +", " + name + " stumbled upon a mystical " + noun1 + " that radiated a captivating " + color + " glow. ");
        System.out.println("Filled with " + emotion + ", " + name + " decided to go to the " + noun2 + " " + adverb + ". ");
        System.out.println("To their great "+ adjective + " astonishment, " + num + " " + noun3 + "s materialized, ");
        System.out.println("turning this ordinary day into an extraordinary and enchanting adventure.");
        
        scanner.close();
    }
    
}