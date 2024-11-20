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

        double constant = number1;

        while (number2 != 1) {
            number1 = number1 * constant;
            number2 -= 1;
        }
        return String.valueOf(number1);
    }
}


