package Calculators;

import Menu.Calculators;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculators{

    public String arithmeticCalculations(ArrayList<String> a, boolean option1) {
        String result="";

        while(a.contains("(")) {

            //brackets
            int brace = 0;
            int maxBrace = 0;
            int maxCounter = 0;
            String iteration1 = "";
            for (int counter = 0; counter < a.size(); counter++) {
                if (a.get(counter).equals("(")) {
                    maxCounter = counter;
                    brace++;
                }
            }
            maxBrace = brace;
            int counter2 = 1;
            ArrayList<String> subList = null;
            ArrayList<String> subList1 = null;
            for (int counter = 0; counter < a.size(); counter++) {
                if (a.get(counter).equals(")")) {
                    brace--;

                    if (maxBrace - brace == counter2) {
                        subList = new ArrayList<>(a.subList(maxCounter + 1, counter));
                        subList1 = new ArrayList<>(a.subList(maxCounter, counter + 1));
                        a.subList(maxCounter, counter + 1).clear();
                        counter++;

                        if (option1) {
                            System.out.println(subList);
                        }

                        iteration1 = arithmeticCalculations(subList, option1);
                        if (option1) {
                            System.out.println(arithmeticCalculations(subList, option1));
                        }
                        a.add(maxCounter, iteration1);
                        a.removeIf(s -> s == null || s.isEmpty());
                        if (option1) {
                            System.out.println(a);
                        }
                    }
                }
            }
        }


        //power
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("^")) {
                result = Calculations.power(a.get(counter - 1), a.get(counter + 1));
                a.remove(counter);


                a.remove(counter);
                a.set(counter - 1, result);
                counter -= counter;

                if(option1 || a.size() != 1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //factorial
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("!")) {
                result = Calculations.factorial(a.get(counter - 1));
                a.remove(counter);


                a.set(counter - 1, result);
                counter -= counter;


                if(option1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // log
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("l")) {
                result = Calculations.log(a.get(counter + 1));
                a.remove(counter + 1);
                a.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }




        // sin
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("s")) {
                result = Calculations.sin(a.get(counter + 1));
                a.remove(counter + 1);
                a.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // cos
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("c")) {
                result = Calculations.cos(a.get(counter + 1));
                a.remove(counter + 1);
                a.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // tan
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("t")) {
                result = Calculations.tan(a.get(counter + 1));
                a.remove(counter + 1);
                a.set(counter, result);
                counter = 0;
                if (option1) {
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        // Modulus operation
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("%")) {
                result = Calculations.modulus(a.get(counter - 1), a.get(counter + 1));
                a.remove(counter);
                a.remove(counter);
                a.set(counter - 1, result);
                counter = 0;

                if (option1) {
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }





        //multiply
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("*")) {
                result = Calculations.multiply(a.get(counter - 1), a.get(counter + 1));
                a.remove(counter);


                a.remove(counter);
                a.set(counter - 1, result);
                counter -= counter;


                if(option1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //division
        for (int counter = 0; counter < a.size(); counter++) {
            if (a.get(counter).equals("/")) {
                result = Calculations.divide(a.get(counter - 1), a.get(counter + 1));
                a.remove(counter);


                a.remove(counter);
                a.set(counter - 1, result);
                counter = 0;


                if(option1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }

        //addition and subtraction
        for (
                int counter1 = 0; counter1 < a.size(); counter1++) {

            //addition
            if (a.get(counter1).equals("+")) {
                result = Calculations.add(a.get(counter1 - 1), a.get(counter1 + 1));
                a.remove(counter1);
                a.remove(counter1);
                a.set(counter1 - 1, result);
                counter1 = 0;


                if(option1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }


            //subtraction
            if (a.get(counter1).equals("-")) {
                result = Calculations.subtract(a.get(counter1 - 1), a.get(counter1 + 1));
                a.remove(counter1);


                a.remove(counter1);
                a.set(counter1 - 1, result);
                counter1 = 0;

                if(option1){
                    for (String s : a) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
        }
        return result;
    }
}