package Calculators;

import java.util.NoSuchElementException;
import java.util.Scanner;



class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}

class InvalidInputException extends CalculationException {
    public InvalidInputException(String message) {
        super(message);
    }
}



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
        Scanner input = new Scanner(System.in);
        try {
            double number1 = Double.parseDouble(a);
            double number2 = Double.parseDouble(b);
            while (number2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                System.out.print("Please enter a new non-zero value for the divisor: ");
                number2 = input.nextDouble();

            }
            return String.valueOf(number1 / number2);
        } catch (NumberFormatException e) {
            return "Error: Enter valid numbers, please!";
        } catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";
        }
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
        Scanner input = new Scanner(System.in);
        try {
            double number = Double.parseDouble(a);

            while (number <= 0) {
                System.out.println("Error: logarithm of a negative number is undefined! ");
                System.out.print("Please enter a new non-zero value! ");
                number = input.nextDouble();
            }
            return String.valueOf(Math.log(number));
        }catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";
        }
    }


    static String factorial(String a) {
        validateInputs(a, null, "factorial");
        Scanner input = new Scanner(System.in);
        try {
            double number1 = Double.parseDouble(a);
            while (number1 >= 171) {
                System.out.println("Error:Number is too large");
                System.out.print("Please enter a smaller number! ");
                number1 = input.nextDouble();
            }
            while (number1 < 0) {
                System.out.println("Error: Factorial is only defined for non-negative integers!");
                System.out.print("Please enter a number > 0 ");
                number1 = input.nextDouble();

            }
            while (number1 != (int) number1) {
                System.out.println("Error: Factorial is only defined for whole numbers.");
                System.out.print("Please enter an integer!");
                number1 = input.nextDouble();
            }

            double result = 1;
            while (number1 != 0) {
                result *= number1;
                number1 -= 1;

            }
            return String.valueOf(result);

        } catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";
        }
    }



    static String modulus(String a, String b) {
        validateInputs(a, b, "modulus");
        Scanner input = new Scanner(System.in);
        try {
            double number1 = Double.parseDouble(a);
            double number2 = Double.parseDouble(b);
            while (number2 == 0) {
                System.out.println("Error: modulus by zero is not allowed.");
                System.out.print("Please enter a new non-zero value for the modulus: ");
                number2 = input.nextDouble();

            }if (Double.isInfinite(number1) || Double.isInfinite(number2)) {
                throw new ArithmeticException("Error: One of the mumbers is infinite/too large, please try a smaller number!");
            }
            return String.valueOf(number1 % number2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error: Please enter valid numbers, please!");
        } catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";
        }
    }




    public static void validateInputs(String a, String b, String operation) {
        if (a == null || a.isEmpty()) {
            throw new InvalidInputException("Error: Invalid input for " + operation);
        }
        try {
            Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: Input must be a valid number for " + operation);
        }

        if (b != null) {
            if (b.isEmpty()) {
                throw new InvalidInputException("Error: Invalid input for " + operation);
            }
            try {
                Double.parseDouble(b);
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Error: Input must be a valid number for " + operation);
            }
        }
    }
}