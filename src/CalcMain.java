import java.util.Scanner;
import java.util.ArrayList;

public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sum");
        String a = input.nextLine();
        String hello;
        String[] stringArray = a.split("");

        ArrayList<String> finalList = new ArrayList<>();
        String value = "";

        // Parsing logic
        for (String s : stringArray) {
            if (s.matches("[0-9.]")) { // Matches numbers and decimals
                value += s;
            } else if (s.matches("[+\\-*/]")) { // Matches operators
                if (!value.isEmpty()) {
                    finalList.add(value); // Add accumulated value
                }
                finalList.add(s); // Add operator
                value = "";
            } else if (s.matches("[a-zA-Z]")) { // Matches letters (for sin, cos, tan)
                value += s;
                if (value.equals("sin") || value.equals("cos") || value.equals("tan")) {
                    finalList.add(value); // Add sin, cos, or tan as a separate element
                    value = ""; // Reset for the next part
                }
            } else {
                if (!value.isEmpty()) {
                    finalList.add(value);
                }
                value = "";
            }
        }
        if (!value.isEmpty()) { // Add any remaining value
            finalList.add(value);
        }

        for (String s : finalList) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Handle sin, cos, and tan
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("sin")) {
                hello = Calculations.sin(finalList.get(counter + 1));
                finalList.remove(counter); // Remove "sin"
                finalList.set(counter, hello); // Replace the number with result
                counter--;
            } else if (finalList.get(counter).equals("cos")) {
                hello = Calculations.cos(finalList.get(counter + 1));
                finalList.remove(counter); // Remove "cos"
                finalList.set(counter, hello); // Replace the number with result
                counter--;
            } else if (finalList.get(counter).equals("tan")) {
                hello = Calculations.tan(finalList.get(counter + 1));
                finalList.remove(counter); // Remove "tan"
                finalList.set(counter, hello); // Replace the number with result
                counter--;
            }
        }

        // Multiply
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("*")) {
                hello = Calculations.multiply(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);
                finalList.remove(counter + 0);
                finalList.set(counter - 1, hello);
                counter = 0;
            }
        }

        // Division
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("/")) {
                hello = Calculations.divide(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);
                finalList.remove(counter + 0);
                finalList.set(counter - 1, hello);
                counter = 0;
            }
        }

        // Addition and subtraction
        for (int counter1 = 0; counter1 < finalList.size(); counter1++) {
            if (finalList.get(counter1).equals("+")) {
                hello = Calculations.add(finalList.get(counter1 - 1), finalList.get(counter1 + 1));
                finalList.remove(counter1 + 0);
                finalList.remove(counter1 + 0);
                finalList.set(counter1 - 1, hello);
                counter1 = 0;
            } else if (finalList.get(counter1).equals("-")) {
                hello = Calculations.subtract(finalList.get(counter1 - 1), finalList.get(counter1 + 1));
                finalList.remove(counter1 + 0);
                finalList.remove(counter1 + 0);
                finalList.set(counter1 - 1, hello);
                counter1 = 0;
            }
        }

        for (String s : finalList) {
            System.out.print(s + " ");
        }
        System.out.println("\nResult: " + finalList.get(0));
    }
}
