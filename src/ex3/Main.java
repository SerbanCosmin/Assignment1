package ex3;
import java.util.Arrays;
import static ex3.Operations.*;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int singleDigit = 2;

        System.out.println("Addition: " + Arrays.toString(add(num1, num2)));

        System.out.println("Differenz: " + Arrays.toString(subtract(num3, num4)));

        System.out.println("Multiplikation: " + Arrays.toString(multiply(num5, singleDigit)));

        System.out.println("Division: " + Arrays.toString(divide(num5, singleDigit)));
    }
}
