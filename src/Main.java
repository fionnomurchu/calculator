import java.util.ArrayList;

public class Main {

public static String bro(ArrayList<String> a) {
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


            for (String s : finalList) {
                System.out.print(s + " ");
            }
            System.out.println();
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


            for (String s : finalList) {
                System.out.print(s + " ");
            }
            System.out.println();
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


            for (String s : finalList) {
                System.out.print(s + " ");
            }
            System.out.println();
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


            for (String s : finalList) {
                System.out.print(s + " ");
            }
            System.out.println();
        }


        //subtraction
        if (finalList.get(counter1).equals("-")) {
            result = Calculations.subtract(finalList.get(counter1 - 1), finalList.get(counter1 + 1));
            finalList.remove(counter1 + 0);


            finalList.remove(counter1 + 0);
            finalList.set(counter1 - 1, result);
            counter1 = 0;

            for (String s : finalList) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
return result;
}
}