package Test;

public class TestMultiplication extends BaseTest {
    public boolean isDouble(String value1) {
        boolean isDouble = false;
        String a = value1.trim();
        try {
            Double.parseDouble(a);
            isDouble = true;
        } catch (NumberFormatException e) {
            System.out.println("No double value was entered.  " + e.getMessage());
        }
        return isDouble;
    }

    public boolean checkNumber(String sayi) {
        boolean isCheck = false;
        if (!sayi.isEmpty()) {
            if (isDouble(sayi)) {
                isCheck = true;
            }
        } else {
            new BaseTest().emptyValue();
        }
        return isCheck;
    }
}
