package Test;

public class TestMultiplication extends BaseTest {
    public boolean isDouble(String value1, String value2) {
        boolean isDouble = false;
        String a = value1.trim();
        String b = value2.trim();
        try {
            Double.parseDouble(a);
            Double.parseDouble(b);
            isDouble = true;
        } catch (NumberFormatException e) {
            System.out.println("No double value was entered.  " + e.getMessage());
        }
        return isDouble;
    }
}
