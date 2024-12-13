package Calcuators;

import Menu.Calculators;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculators{

    public static String bro(ArrayList<String> a, boolean option1) {
        ArrayList<String> finalList = a;
        String result="";

        //power
        for (
                int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("^")) {
                result = Calculations.power(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);


                finalList.remove(counter + 0);
                finalList.set(counter - 1, result);
                counter -= counter;

                if(option1 || finalList.size() != 1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //factorial
        for (
                int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("!")) {
                result = Calculations.factorial(finalList.get(counter - 1));
                finalList.remove(counter + 0);


                finalList.set(counter - 1, result);
                counter -= counter;


                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // log
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("l")) {
                result = Calculations.log(finalList.get(counter + 1));
                finalList.remove(counter + 1);
                finalList.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }




        // sin
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("s")) {
                result = Calculations.sin(finalList.get(counter + 1));
                finalList.remove(counter + 1);
                finalList.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // cos
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("c")) {
                result = Calculations.cos(finalList.get(counter + 1));
                finalList.remove(counter + 1);
                finalList.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // tan
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("t")) {
                result = Calculations.tan(finalList.get(counter + 1));
                finalList.remove(counter + 1);
                finalList.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // Modulus operation
        for (
                int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("%")) {
                result = Calculations.modulus(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);
                finalList.remove(counter + 0);
                finalList.set(counter - 1, result);
                counter = 0;

                if (option1) {
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }





        //multiply
        for (
                int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("*")) {
                result = Calculations.multiply(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);


                finalList.remove(counter + 0);
                finalList.set(counter - 1, result);
                counter -= counter;


                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //division
        for (
                int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("/")) {
                result = Calculations.divide(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);


                finalList.remove(counter + 0);
                finalList.set(counter - 1, result);
                counter = 0;


                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //addition and subtraction
        for (
                int counter1 = 0; counter1 < finalList.size(); counter1++) {

            //addition
            if (finalList.get(counter1).equals("+")) {
                result = Calculations.add(finalList.get(counter1 - 1), finalList.get(counter1 + 1));
                finalList.remove(counter1 + 0);
                finalList.remove(counter1 + 0);
                finalList.set(counter1 - 1, result);
                counter1 = 0;


                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }


            //subtraction
            if (finalList.get(counter1).equals("-")) {
                result = Calculations.subtract(finalList.get(counter1 - 1), finalList.get(counter1 + 1));
                finalList.remove(counter1 + 0);


                finalList.remove(counter1 + 0);
                finalList.set(counter1 - 1, result);
                counter1 = 0;

                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }
        return result;
    }
}