package Functions;

import Calculate.BaseCalculate;
import Test.TestMultiplication;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateMultiplication {
    public static void operation() {
        Scanner input = new Scanner(System.in);
        TestMultiplication test = new TestMultiplication();
        System.out.println("Please enter first number:  ");
        String sayi1 = input.nextLine();
        if (test.checkNumber(sayi1)) {
            System.out.println("Please enter second number:  ");
            String sayi2 = input.nextLine();
            if (test.checkNumber(sayi2)) {
                calculateTotalMultiplication(sayi1, sayi2);
            } else {
                operation();
            }
        } else {
            operation();
        }
    }

    public static void calculateTotalMultiplication(String sayi1, String sayi2) {
        double value1 = Double.parseDouble(sayi1);
        double value2 = Double.parseDouble(sayi2);
        double totalValueMult = BaseCalculate.calculateMultiplication(value1, value2);
        BaseCalculate.refactorFormatter("Result: ", totalValueMult);
    }
}
