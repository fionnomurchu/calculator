import java.util.ArrayList;

public class Calculations {

    static String add(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 + number2;
        return String.valueOf(c);
    }


    static String subtract(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 - number2;
        return String.valueOf(c);
    }

    static String multiply(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 * number2;
        return String.valueOf(c);
    }

    static String divide(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 / number2;
        return String.valueOf(c);
    }

    static String power(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        number1 = Math.pow(number1, number2);

        return String.valueOf(number1);
    }

    static String sin(String a) {
        double number = Double.parseDouble(a);
        return String.valueOf(Math.sin(Math.toRadians(number)));
    }

    static String cos(String a) {
        double number = Double.parseDouble(a);
        return String.valueOf(Math.cos(Math.toRadians(number)));
    }

    static String tan(String a) {
        double number = Double.parseDouble(a);
        return String.valueOf(Math.tan(Math.toRadians(number)));
    }

    static String log(String a) {
        double number = Double.parseDouble(a);
        return String.valueOf((Math.log(number)));
    }

    static String factorial(String a) {
        double number1 = Double.parseDouble(a);
        double result = 1;

        while (number1 != 0) {
            if (Math.signum(number1) == 1.00) {
                result *= number1;
                number1 -= 1;
            } else if (Math.signum(number1) == -1.00) {
                result *= number1;
                number1 += 1;
            }
        }
        return String.valueOf(result);
    }

    static String modulus(String a, String b) {
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double result = number1 % number2;
        return String.valueOf(result);
    }


}

