package Functions;

import Test.BaseTest;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        BaseTest baseTest = new BaseTest();
        Scanner input = new Scanner(System.in);
        System.out.println("What action would you like to take? Choose according to the codes next to them.");
        System.out.println("A - Sum of the numbers up to n entered from outside");
        System.out.println("B - Perimeter and area of a circle whose radius is entered from outside");
        System.out.println("C - Sum of odd integers up to an integer entered from outside");
        System.out.println("D - Multiplication of two numbers without using multiplication");
        System.out.println("E - Exit");
        System.out.println("Select: ");

        String menuValue = input.nextLine();
            switch (menuValue.toUpperCase()) {
                case ("A"):
                    CalculateTotalN.operation();
                    break;
                case ("B"):
                    CalculateCircle.operation();
                    break;
                case ("C"):
                    CalculateTotalOdd.operation();
                    break;
                case ("D"):
                    CalculateMultiplication.operation();
                    break;
                case ("E"):
                    System.exit(0);
                    break;
                default:
                    baseTest.wrongChoiceMenuMessage();
            }
    }
}

