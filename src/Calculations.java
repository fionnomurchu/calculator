import java.util.ArrayList;

public class Calculations {

    static String add(String a, String b) {
        validateInputs(a, b, "addition");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 + number2);
    }

    static String subtract(String a, String b) {
        validateInputs(a, b, "subtraction");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 - number2);
    }

    static String multiply(String a, String b) {
        validateInputs(a, b, "multiplication");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 * number2);
    }

    static String divide(String a, String b) {
        validateInputs(a, b, "division");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        if (number2 == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return String.valueOf(number1 / number2);
    }

    static String power(String a, String b) {
        validateInputs(a, b, "power");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(Math.pow(number1, number2));
    }

    static String sin(String a) {
        validateInputs(a, null, "sine");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.sin(Math.toRadians(number)));
    }

    static String cos(String a) {
        validateInputs(a, null, "cosine");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.cos(Math.toRadians(number)));
    }

    static String tan(String a) {
        validateInputs(a, null, "tangent");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.tan(Math.toRadians(number)));
    }

    static String log(String a) {
        validateInputs(a, null, "logarithm");
        double number = Double.parseDouble(a);
        if (number <= 0) {
            throw new ArithmeticException("Error: Logarithm undefined for non-positive numbers.");
        }
        return String.valueOf(Math.log(number));
    }

    static String factorial(String a) {
        validateInputs(a, null, "factorial");
        double number1 = Double.parseDouble(a);
        if (number1 < 0) {
            throw new IllegalArgumentException("Error: Factorial is only defined for non-negative integers.");
        }
        double result = 1;
        while (number1 != 0) {
            result *= number1;
            number1 -= 1;
        }
        return String.valueOf(result);
    }

    static String modulus(String a, String b) {
        validateInputs(a, b, "modulus");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 % number2);
    }

    public static void validateInputs(String a, String b, String operation) {
        if (a == null || a.isEmpty()) {
            throw new IllegalArgumentException("Error: Invalid input for " + operation);
        }
        try {
            Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Input must be a valid number for " + operation);
        }

        if (b != null) {
            if (b.isEmpty()) {
                throw new IllegalArgumentException("Error: Invalid input for " + operation);
            }
            try {
                Double.parseDouble(b);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Error: Input must be a valid number for " + operation);
            }
        }
    }
}
