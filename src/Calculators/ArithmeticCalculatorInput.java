package Calculators;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticCalculatorInput {
    //Calculator method that takes the string "ans" as an argument
    //This method contains option 2 which allows you to enter a sum
    //Method processes the sum as a string and divides it in to a string array
    public static ArrayList<String> input(String ans) {

        //Takes in the sum input as a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your equation: ");
        String a = input.nextLine();

        //Divides the String in to a string array
        String[] stringArray = a.split("");
        ArrayList<String> finalList = new ArrayList<>();

        String value = "";
        String checker = "";

        for (String s : stringArray) {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9") || s.equals(".")
                    || s.equals("-") & value.isEmpty()
                    & !checker.equals("1")) {
                value += s;

            } else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/"))
                    || (s.equals("^")) || (s.equals("!")) || (s.equals("%"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "";
            }
            else if (s.equals("(") || (s.equals(")"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "1";

            }

            //Previous result
            else if (s.equals("a") & value.isEmpty()){
                value = ans;
            }

            //Euler's constant
            else if (s.equals("e")){
                value = String.valueOf(Math.E);
            }

            //Pi
            else if (s.equals("p")){
                value= String.valueOf(Math.PI);
            }

            else if (s.equals("s") || s.equals("c") || s.equals("t") || s.equals("l")) { // For sin, cos, tan, log
                if (!value.isEmpty()) {
                    finalList.add(value);
                    value = "";
                }
                finalList.add(s);

            }

            else {
                System.out.println(s);
                System.out.print("Invalid input\n");
                finalList = ArithmeticCalculatorInput.input(ans);

                break;
            }
        }
        finalList.add(value);

        return finalList;

    }
}
