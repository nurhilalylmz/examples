package Functions;

import Calculate.BaseCalculate;
import Test.TotalN;
import java.util.Scanner;

public class CalculateTotalN {

    public static void operation() {
        Scanner input = new Scanner(System.in);
        TotalN testN = new TotalN();
        System.out.println("Please enter a number:  ");
        String sayi = input.nextLine();
        if (!sayi.isEmpty()) {
            if (testN.isDouble(sayi)) {
                calculateTotalN(sayi);
            } else {
                operation();
            }
        } else {
            testN.emptyValue();
            operation();
        }

    }
    public static void calculateTotalN(String sayi){
        double value = Double.parseDouble(sayi);
        double totalValueN = BaseCalculate.calculateTotal(value);
        System.out.println("Total: " + totalValueN);
    }
}
