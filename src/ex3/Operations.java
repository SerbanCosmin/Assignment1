package ex3;
import java.util.Arrays;

public class Operations {

    // Addition
    public static int[] add(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1];
        int carry = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return carry == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    // Differenz
    public static int[] subtract(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int borrow = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }

    // Multiplikation
    public static int[] multiply(int[] num, int singleDigit) {
        int[] result = new int[num.length + 1];
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int product = num[i] * singleDigit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;
        return carry == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    //Division
    public static int[] divide(int[] num, int div) {
        int[] result = new int[num.length];
        int rest = 0;

        for (int i = 0; i < num.length; i++) {
            int current = rest * 10 + num[i];
            result[i] = current / div;
            rest = current % div;
        }

        int leadingZeros = 0;
        while (leadingZeros < result.length && result[leadingZeros] == 0) {
            leadingZeros++;
        }

        return leadingZeros == result.length ? new int[]{0} : Arrays.copyOfRange(result, leadingZeros, result.length);
    }
}
