import com.sun.jdi.ArrayReference;

import java.util.Scanner;
import java.util.ArrayList;


public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sum: ");
        String a = input.nextLine();
        String[] stringArray = a.split("");
        String iteration1="";


        ArrayList<String> finalList = new ArrayList<>();
        String value = "";

        for (String s : stringArray) {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9") || s.equals(".")
                    || s.equals("-") & value.isEmpty()
            ) {
                value += s;
            } else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/"))
                    || (s.equals("^")) || (s.equals("(")) || (s.equals(")")) || (s.equals("!"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
            } else {
                System.out.print("Invalid input");

                break;
            }
        }
        finalList.add(value);


        //prints string of input
        for (String s : finalList) {
            System.out.print(s + " ");
        }
        System.out.println();



        //check for brackets
        for (int counter = 0; counter < finalList.size(); counter++) {
            if (finalList.get(counter).equals("(")) {
                break;
            }
            if (counter== finalList.size()-1){
                System.out.println(Main.bro(finalList));
            }
        }


        while(finalList.contains("(")) {

            //brackets
            int brace = 0;
            int maxbrace = 0;
            int maxcounter = 0;
            for (int counter = 0; counter < finalList.size(); counter++) {
                if (finalList.get(counter).equals("(")) {
                    maxcounter = counter;
                    brace++;
                }
            }
            maxbrace = brace;
            int counter2 = 1;
            ArrayList<String> subList = null;
            ArrayList<String> subList1 = null;
            for (int counter = 0; counter < finalList.size(); counter++) {
                if (finalList.get(counter).equals(")")) {
                    brace--;

                    if (maxbrace - brace == counter2) {
                        subList = new ArrayList<>(finalList.subList(maxcounter + 1, counter));
                        subList1 = new ArrayList<>(finalList.subList(maxcounter, counter + 1));
                        finalList.subList(maxcounter, counter + 1).clear();
                        System.out.println(finalList);
                        counter++;

                        System.out.println(subList);
                        iteration1 = Main.bro(subList);
                        System.out.println(Main.bro(subList));
                        finalList.add(maxcounter, iteration1);
                        finalList.removeIf(s -> s == null || s.isEmpty());
                        System.out.println(finalList);
                    }
                }
            }


        }
        System.out.println(Main.bro(finalList));

    }
}