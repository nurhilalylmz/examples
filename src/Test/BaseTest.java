package Test;

public class BaseTest {
    public boolean isInteger(String value) {
        boolean isInteger = false;
        String x = value.trim();
        try {
            int number = Integer.parseInt(x);
            if (check(number)) {
                isInteger = true;
            } else {
                lessZeroMessage();
            }
        } catch (NumberFormatException e) {
            System.out.println("No integer value was entered.  " + e.getMessage());
        }
        return isInteger;
    }

    public boolean isDouble(String value) {
        boolean isDouble = false;
        String x = value.trim();
        try {
            double number = Double.parseDouble(x);
            if (check(number)) {
                isDouble = true;
            } else {
                lessZeroMessage();
            }
        } catch (NumberFormatException e) {
            System.out.println("No double value was entered.  " + e.getMessage());
        }
        return isDouble;
    }

    public boolean check(int value) {
        boolean isCheckNumber = false;
        if (value >= 0) {
            isCheckNumber = true;
        }
        return isCheckNumber;
    }

    public boolean check(double value) {
        boolean isCheckNumber = false;
        if (value >= 0) {
            isCheckNumber = true;
        }
        return isCheckNumber;
    }

    public void emptyValue() {
        System.out.println("Entered a null value.\n");
    }

    public void wrongChoiceMenuMessage() {
        System.out.println("Make sure you entered the correct code!");
    }

    public void lessZeroMessage() {
        System.out.println("The number is less than 0. Transaction cannot be done.");
    }
}


