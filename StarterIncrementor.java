  import java.util.Scanner;
public class StarterIncrementor {

    public static void main(String[] args) {

        forLoop();

    }
    
    public static void forLoop () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Start At:");
        int starter = sc.nextInt();

        System.out.println("Increment by:");
        int c = sc.nextInt();

        sc.close();
        System.out.println();

        for (int i = starter;i <= 300;) {
            System.out.println(i);
            i = i + c;
        }

    }

}