package Calculators;

import java.util.NoSuchElementException;
import java.util.Scanner;


//exception class that handles calculation errors
class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}
//exception class that handles input errors
class InvalidInputException extends CalculationException {
    public InvalidInputException(String message) {
        super(message);
    }
}



public class Calculations {
//method to perform addition
    static String add(String a, String b) {
        validateInputs(a, b, "addition");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 + number2);
    }
//method to perform subtraction
    static String subtract(String a, String b) {
        validateInputs(a, b, "subtraction");

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 - number2);

    }

//method to perform multiplication
    static String multiply(String a, String b) {
        validateInputs(a, b, "multiplication");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(number1 * number2);
    }
//method to perform division
    static String divide(String a, String b) {
        validateInputs(a, b, "division");
        Scanner input = new Scanner(System.in);
        try {//exception handling for when division by 0 is encountered
            double number1 = Double.parseDouble(a);
            double number2 = Double.parseDouble(b);
            while (number2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                System.out.print("Please enter a new non-zero value for the divisor: ");
                number2 = input.nextDouble();

            }
            return String.valueOf(number1 / number2);
        } catch (NumberFormatException e) {//handles invalid number inputs
            return "Error: Enter valid numbers, please!";
        } catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";//handles unexpected inputs and restarts
        }
    }
//method to perform powers (a^b)
    static String power(String a, String b) {
        validateInputs(a, b, "power");
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        return String.valueOf(Math.pow(number1, number2));
    }
//method to calculate sine in degrees
    static String sin(String a) {
        validateInputs(a, null, "sine");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.sin(Math.toRadians(number)));//converts from degrees to radians
    }
//method to calculate cosine in degrees
    static String cos(String a) {
        validateInputs(a, null, "cosine");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.cos(Math.toRadians(number)));//converts from degrees to radians
    }
//method to calculate tangent in degrees
    static String tan(String a) {
        validateInputs(a, null, "tangent");
        double number = Double.parseDouble(a);
        return String.valueOf(Math.tan(Math.toRadians(number)));//converts from degrees to radians
    }
//method to calculate logarithm(log to the base e)
    static String log(String a) {
        validateInputs(a, null, "logarithm");
        Scanner input = new Scanner(System.in);
        try {//exception handling for when logarith of a negative number is encountered
            double number = Double.parseDouble(a);

            while (number <= 0) {
                System.out.println("Error: logarithm of a negative number is undefined! ");
                System.out.print("Please enter a new non-zero value! ");
                number = input.nextDouble();
            }
            return String.valueOf(Math.log(number));
        }catch (IllegalStateException | NoSuchElementException e) {//handles unexpected inputs 
            return "Error: Input stream issue. Please restart.";
        }
    }

//method to calculate factorial
    static String factorial(String a) {
        validateInputs(a, null, "factorial");
        Scanner input = new Scanner(System.in);
        try {//exception handling 
            double number1 = Double.parseDouble(a);
            //while loop to handle numbers that are too big to compute
            while (number1 >= 171) {
                System.out.println("Error:Number is too large");
                System.out.print("Please enter a smaller number! ");
                number1 = input.nextDouble();
            }
            //handles numbers less than 0
            while (number1 < 0) {
                System.out.println("Error: Factorial is only defined for non-negative integers!");
                System.out.print("Please enter a number > 0 ");
                number1 = input.nextDouble();

            }
            //handles numbers that are not integers
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

        } catch (IllegalStateException | NoSuchElementException e) {//handles unexpected inputs
            return "Error: Input stream issue. Please restart.";
        }
    }



    static String modulus(String a, String b) {
        validateInputs(a, b, "modulus");
        Scanner input = new Scanner(System.in);
        try {//exception handling
            double number1 = Double.parseDouble(a);
            double number2 = Double.parseDouble(b);

            //handles modulus by 0
            while (number2 == 0) {
                System.out.println("Error: modulus by zero is not allowed.");
                System.out.print("Please enter a new non-zero value for the modulus: ");
                number2 = input.nextDouble();
            //handles if the number is too big 
            }if (Double.isInfinite(number1) || Double.isInfinite(number2)) {
                throw new ArithmeticException("Error: One of the mumbers is infinite/too large, please try a smaller number!");
            }
            return String.valueOf(number1 % number2);
        } catch (NumberFormatException e) {//handles invalid numbers
            throw new IllegalArgumentException("Error: Please enter valid numbers, please!");
        } catch (IllegalStateException | NoSuchElementException e) {
            return "Error: Input stream issue. Please restart.";//handles unexpceted inputs
        }
    }


//reusable block of code to validate the inputs
    public static void validateInputs(String a, String b, String operation) {
        if (a == null || a.isEmpty()) {
            throw new InvalidInputException("Error: Invalid input for " + operation);
        }
        try {
            Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: Input must be a valid number for " + operation);
        }
//checks if second number is valid
        if (b != null) {
            if (b.isEmpty()) {
                throw new InvalidInputException("Error: Invalid input for " + operation);
            }
            try {
                Double.parseDouble(b);//parses second input as a number
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Error: Input must be a valid number for " + operation);
            }
        }
    }
}
