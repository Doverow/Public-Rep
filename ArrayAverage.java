import java.util.Random;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SEED:");
        int seed = sc.nextInt();
        Random rng = new Random(seed);

        System.out.println();

        System.out.println("SIZE:");
        int size = sc.nextInt();
        int[] rngArr = new int[size];
        
        sc.close();
        System.out.println(); 

        for (int i = 0; i < rngArr.length; i++) {
            rngArr[i] = rng.nextInt(100) + 1;
        }
        printArray(rngArr);
        printArrayAverage(rngArr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }

     public static void printArrayAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average: " + (sum / arr.length));
    }

    }
