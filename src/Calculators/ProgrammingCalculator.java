package Calculators;

import Menu.Calculators;

import java.util.Scanner;

public class ProgrammingCalculator extends Calculators {
//overrides runCalculator to run number conversion operations
    @Override
    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number System Converter:\n1 - Input Binary\n2 - Input Decimal\n3 - Input Hexadecimal");
        String choice = scanner.nextLine();

        if (choice.equals("1")) { // Binary Input
            System.out.print("Enter a binary number: ");
            String binary = scanner.nextLine();

            try {
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("Decimal: " + decimal);
                System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                System.out.println("--------------------");
            } catch (NumberFormatException e) {//catches invalid inputs 
                System.out.println("Invalid binary number");
                System.out.println("--------------------");
            }
        }


        else if (choice.equals("2")) { // Decimal Input
            System.out.print("Enter a decimal number: ");
            String decimalInput = scanner.nextLine();
            try {
                int decimal = Integer.parseInt(decimalInput);
                System.out.println("Binary: " + Integer.toBinaryString(decimal));
                System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                System.out.println("--------------------");
            } catch (NumberFormatException e) {
                System.out.println("Invalid decimal number");//catches invalid inputs 
                System.out.println("--------------------");
            }
        }

        else if (choice.equals("3")) { // Hexadecimal Input
            System.out.print("Enter a hexadecimal number: ");
            String hex = scanner.nextLine();


            try {
                int decimal = Integer.parseInt(hex, 16);
                System.out.println("Binary: " + Integer.toBinaryString(decimal));
                System.out.println("Decimal: " + decimal);
                System.out.println("--------------------");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid hexadecimal number");//catches invalid inputs 
                System.out.println("--------------------");
            }
        }

        else {
            System.out.println("Invalid choice.");//catches invalid inputs 
            System.out.println("--------------------");
        }
    }
}
