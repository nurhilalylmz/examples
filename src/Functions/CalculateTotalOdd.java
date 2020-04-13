package Functions;

import Calculate.BaseCalculate;
import Test.BaseTest;
import Test.TestOddTotal;

import java.util.Scanner;

public class CalculateTotalOdd {
    public static void operation() {
        Scanner input = new Scanner(System.in);
        BaseTest test = new TestOddTotal();
        System.out.println("Please enter a number:  ");
        String sayi = input.nextLine();
        if (!sayi.isEmpty()) {
            if (test.isInteger(sayi)) {
                calculateOddTotal(sayi);
            } else {
                operation();
            }
        } else {
            test.emptyValue();
            operation();
        }

    }
    public static void calculateOddTotal(String sayi){
        int value = Integer.parseInt(sayi);
        int totalValueN = BaseCalculate.calculateSumOddNumbers(value);
        System.out.println("Total: " + totalValueN);
    }
}
