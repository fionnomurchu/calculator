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

        int i = 1;
        double constant = number1;

        while (i < number2) {
            number1 = number1 * constant;
        }
        return String.valueOf(number1);
    }
}


