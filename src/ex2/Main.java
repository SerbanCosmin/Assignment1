package ex2;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("n = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter array nums: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.printf("array = ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        int maxsum = 0;
        int minsum = 0;
        for (int i = n-1; i > 0; i--) {
            maxsum += array[i];
        }
        for (int i = 0; i < n-1; i++) {
            minsum += array[i];
        }
        System.out.printf("Maximale Zahl:  %d%n", array[n-1]);
        System.out.printf("Minimale Zahl:  %d%n", array[0]);
        System.out.printf("Maximale Summe von n-1 Zahlen:  %d%n", maxsum);
        System.out.printf("Minimale Summe von n-1 Zahlen:  %d%n", minsum);
    }
}

