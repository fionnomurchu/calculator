import java.util.Scanner;

public class BinaryCalculator {

    public static String binaryToDecimal(String binary) {
        try {
            int decimal = Integer.parseInt(binary, 2);
            return String.valueOf(decimal);
        } catch (NumberFormatException e) {
            return "Invalid binary number";
        }
    }

    public static String decimalToBinary(String decimal) {
        try {
            int number = Integer.parseInt(decimal);
            return Integer.toBinaryString(number);
        } catch (NumberFormatException e) {
            return "Invalid decimal number";
        }
    }

    public static void runBinaryCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Binary Calculator:\n1 - Binary to Decimal\n2 - Decimal to Binary");
        String choice = input.nextLine();

        if (choice.equals("1")) {
            System.out.print("Enter a binary number: ");
            String binary = input.nextLine();
            System.out.println("Decimal: " + binaryToDecimal(binary));
        } else if (choice.equals("2")) {
            System.out.print("Enter a decimal number: ");
            String decimal = input.nextLine();
            System.out.println("Binary: " + decimalToBinary(decimal));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}