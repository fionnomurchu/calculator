package Calculators;

import Menu.Calculators;

import java.util.Scanner;

public class UnitConverterCalculator extends Calculators {

    @Override
    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unit Converter:");
        System.out.println("Available conversions:");
        System.out.println("1 - Length (Kilometers ↔ Miles, Meters ↔ Feet)");
        System.out.println("2 - Volume (Litres ↔ Gallons)");
        System.out.println("3 - Power (Horsepower ↔ Kilowatts, Watts ↔ Kilowatts, Kilowatts ↔ Megawatts)");
        System.out.println("4 - Temperature (Celsius ↔ Fahrenheit)");
        System.out.println("5 - Weight (Kilograms ↔ Pounds)");
        System.out.println("6 - Land Area (Acres ↔ Hectares)");
        String unit = scanner.nextLine();

        try {
            switch (unit) {
                case "1": // Length
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Kilometers to Miles");
                    System.out.println("2 - Miles to Kilometers");
                    System.out.println("3 - Meters to Feet");
                    System.out.println("4 - Feet to Meters");
                    String lengthOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double lengthValue = Double.parseDouble(scanner.nextLine());

                    if (lengthOption.equals("1")) {
                        System.out.println(lengthValue + " kilometers = " + (lengthValue * 0.621371) + " miles");
                        System.out.println("--------------------");

                    } else if (lengthOption.equals("2")) {
                        System.out.println(lengthValue + " miles = " + (lengthValue * 1.60934) + " kilometers");
                        System.out.println("--------------------");

                    } else if (lengthOption.equals("3")) {
                        System.out.println(lengthValue + " meters = " + (lengthValue * 3.28084) + " feet");
                        System.out.println("--------------------");

                    } else if (lengthOption.equals("4")) {
                        System.out.println(lengthValue + " feet = " + (lengthValue / 3.28084) + " meters");
                        System.out.println("--------------------");
                    } else {
                        System.err.println("Invalid selection.");
                        System.out.println("--------------------");
                    }
                    break;

                case "2": // Volume
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Litres to Gallons");
                    System.out.println("2 - Gallons to Litres");
                    String volumeOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double volumeValue = Double.parseDouble(scanner.nextLine());

                    if (volumeOption.equals("1")) {
                        System.out.println(volumeValue + " litres = " + (volumeValue * 0.264172) + " gallons");
                        System.out.println("--------------------");

                    } else if (volumeOption.equals("2")) {
                        System.out.println(volumeValue + " gallons = " + (volumeValue / 0.264172) + " litres");
                        System.out.println("--------------------");

                    } else {
                        System.err.println("Invalid selection");
                        System.out.println("--------------------");
                    }
                    break;

                case "3": // Power
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Horsepower to Kilowatts");
                    System.out.println("2 - Kilowatts to Horsepower");
                    System.out.println("3 - Watts to Kilowatts");
                    System.out.println("4 - Kilowatts to Megawatts");
                    String powerOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double powerValue = Double.parseDouble(scanner.nextLine());

                    if (powerOption.equals("1")) {
                        System.out.println(powerValue + " horsepower = " + (powerValue * 0.7457) + " kilowatts");
                        System.out.println("--------------------");

                    } else if (powerOption.equals("2")) {
                        System.out.println(powerValue + " kilowatts = " + (powerValue / 0.7457) + " horsepower");
                        System.out.println("--------------------");

                    } else if (powerOption.equals("3")) {
                        System.out.println(powerValue + " watts = " + (powerValue * 0.001) + " kilowatts");
                        System.out.println("--------------------");

                    } else if (powerOption.equals("4")) {
                        System.out.println(powerValue + " kilowatts = " + (powerValue * 0.001) + " megawatts");
                        System.out.println("--------------------");

                    } else {
                        System.err.println("Invalid selection");
                        System.out.println("--------------------");
                    }
                    break;

                case "4": // Temperature
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Celsius to Fahrenheit");
                    System.out.println("2 - Fahrenheit to Celsius");
                    String tempOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double tempValue = Double.parseDouble(scanner.nextLine());

                    if (tempOption.equals("1")) {
                        System.out.println(tempValue + " Celsius = " + ((tempValue * 9 / 5) + 32) + " Fahrenheit");
                        System.out.println("--------------------");

                    } else if (tempOption.equals("2")) {
                        System.out.println(tempValue + " Fahrenheit = " + ((tempValue - 32) * 5 / 9) + " Celsius");
                        System.out.println("--------------------");

                    } else {
                        System.err.println("Invalid selection");
                        System.out.println("--------------------");
                    }
                    break;

                case "5": // Weight
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Kilograms to Pounds");
                    System.out.println("2 - Pounds to Kilograms");
                    String weightOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double weightValue = Double.parseDouble(scanner.nextLine());

                    if (weightOption.equals("1")) {
                        System.out.println(weightValue + " kilograms = " + (weightValue * 2.20462) + " pounds");
                        System.out.println("--------------------");

                    } else if (weightOption.equals("2")) {
                        System.out.println(weightValue + " pounds = " + (weightValue / 2.20462) + " kilograms");
                        System.out.println("--------------------");

                    } else {
                        System.err.println("Invalid selection");
                        System.out.println("--------------------");
                    }
                    break;

                case "6": // Land Area
                    System.out.println("Select conversion: ");
                    System.out.println("1 - Acres to Hectares");
                    System.out.println("2 - Hectares to Acres");
                    String landOption = scanner.nextLine();
                    System.out.print("Enter the value to convert: ");
                    double landValue = Double.parseDouble(scanner.nextLine());

                    if (landOption.equals("1")) {
                        System.out.println(landValue + " acres = " + (landValue * 0.404686) + " hectares");
                        System.out.println("--------------------");

                    } else if (landOption.equals("2")) {
                        System.out.println(landValue + " hectares = " + (landValue / 0.404686) + " acres");
                        System.out.println("--------------------");

                    } else {
                        System.err.println("Invalid selection");
                        System.out.println("--------------------");
                    }
                    break;

                default:
                    System.err.println("Invalid unit selection");
                    System.out.println("--------------------");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
