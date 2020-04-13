package Functions;

import Calculate.BaseCalculate;
import Test.TestCircleTotal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateCircle {
    public static void operation() {
        TestCircleTotal testCircleTotal = new TestCircleTotal();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius number:  ");
        String radius = input.nextLine();
        if (radius.isEmpty()) {
            testCircleTotal.emptyValue();
            operation();
        } else {
            if (testCircleTotal.isDouble(radius)) {
                calculateCircle(radius);
            } else {
                operation();
            }
        }

    }

    public static void calculateCircle(String value) {
        double number = Double.parseDouble(value);
        double area = BaseCalculate.calculateArea(number);
        double circle = BaseCalculate.calculateCircle(number);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Area: " + formatter.format(area));
        System.out.println("Circle: " + formatter.format(circle));

    }
}

