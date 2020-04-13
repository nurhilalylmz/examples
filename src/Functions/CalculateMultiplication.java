package Functions;

import Calculate.BaseCalculate;
import Test.BaseTest;
import Test.TestMultiplication;

import java.util.Scanner;

public class CalculateMultiplication {
    public static void operation() {
        Scanner input = new Scanner(System.in);
        TestMultiplication test = new TestMultiplication();
        System.out.println("Please enter first number:  ");
        String sayi1 = input.nextLine();
        System.out.println("Please enter second number:  ");
        String sayi2 = input.nextLine();
        if (!sayi1.isEmpty() && !sayi2.isEmpty()) {
            if (test.isDouble(sayi1,sayi2)) {
                calculateTotalMultiplication(sayi1, sayi2);
            } else {
                operation();
            }
        } else {
            test.emptyValue();
            operation();
        }

    }

    public static void calculateTotalMultiplication(String sayi1, String sayi2) {
        double value1 = Double.parseDouble(sayi1);
        double value2 = Double.parseDouble(sayi2);
        double totalValueN = BaseCalculate.calculateMultiplication(value1, value2);
        System.out.println("Total: " + totalValueN);
    }
}
