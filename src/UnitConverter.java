import java.util.Scanner;

public class UnitConverter {

    public static void runUnitConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unit Converter:");
        System.out.println("Available conversions:");
        System.out.println("1 - Length (Meters ↔ Feet)");
        System.out.println("2 - Weight (Kilograms ↔ Pounds)");
        System.out.println("3 - Temperature (Celsius ↔ Fahrenheit)");
        System.out.print("Choose a category (1, 2, or 3): ");
        String unit = scanner.nextLine();

        try {
            switch (unit) {
                case "1":
                    System.out.println("Select conversion: ");
                    System.out.println("m - Meters to Feet");
                    System.out.println("f - Feet to Meters");
                    String lengthUnit = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the value to convert: ");
                    double lengthValue = Double.parseDouble(scanner.nextLine());
                    if (lengthUnit.equals("m")) {
                        System.out.println(lengthValue + " meters = " + (lengthValue * 3.28084) + " feet");
                    } else if (lengthUnit.equals("f")) {
                        System.out.println(lengthValue + " feet = " + (lengthValue / 3.28084) + " meters");
                    } else {
                        System.out.println("Invalid unit.");
                    }
                    break;

                case "2":
                    System.out.println("Select conversion: ");
                    System.out.println("kg - Kilograms to Pounds");
                    System.out.println("lb - Pounds to Kilograms");
                    String weightUnit = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the value to convert: ");
                    double weightValue = Double.parseDouble(scanner.nextLine());
                    if (weightUnit.equals("kg")) {
                        System.out.println(weightValue + " kilograms = " + (weightValue * 2.20462) + " pounds");
                    } else if (weightUnit.equals("lb")) {
                        System.out.println(weightValue + " pounds = " + (weightValue / 2.20462) + " kilograms");
                    } else {
                        System.out.println("Invalid unit.");
                    }
                    break;

                case "3":
                    System.out.println("Select conversion: ");
                    System.out.println("c - Celsius to Fahrenheit");
                    System.out.println("f - Fahrenheit to Celsius");
                    String tempUnit = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the value to convert: ");
                    double tempValue = Double.parseDouble(scanner.nextLine());
                    if (tempUnit.equals("c")) {
                        System.out.println(tempValue + " Celsius = " + ((tempValue * 9 / 5) + 32) + " Fahrenheit");
                    } else if (tempUnit.equals("f")) {
                        System.out.println(tempValue + " Fahrenheit = " + ((tempValue - 32) * 5 / 9) + " Celsius");
                    } else {
                        System.out.println("Invalid unit.");
                    }
                    break;

                default:
                    System.out.println("Invalid unit selection.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }
}
