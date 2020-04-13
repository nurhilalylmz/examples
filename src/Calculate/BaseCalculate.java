package Calculate;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BaseCalculate {
    public static double calculateTotal(double valueN) {
        double total = 0;
        for (double i = 0; i <= valueN; i++) {
            total += i;
        }
        return total;

    }

    public static double calculateCircle(double radius) {
        return 2 * Math.PI * radius;

    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static int calculateSumOddNumbers(int valueN) {
        int total = 0;
        for (int i = 1; i <= valueN; i += 2) {
            total += i;
        }
        return total;
    }

    public static double calculateMultiplication(double value1, double value2) {
        if (value1 == 0 || value2 == 0) {
            return 0;
        }
        if (value1 < 0) {
            return -calculateMultiplication(-value1, value2);
        }
        if (value1 < 0 && value2 < 0) {
            return -calculateMultiplication(-value1, -value2);
        }
        if (value2 < 0) {
            return -calculateMultiplication(value1, -value2);
        }
        double result = Math.exp(Math.log(value1) + Math.log(value2));
        return result;
    }

    public static void refactorFormatter(String message, double sayi) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println(message + formatter.format(sayi));
    }
}

