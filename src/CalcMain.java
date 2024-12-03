import com.sun.jdi.ArrayReference;

import java.util.Scanner;
import java.util.ArrayList;


public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean option1 = false;
        String ans = "";

        System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");
        String option = input.nextLine();

        while(true){
            if(option.equals("1")){
                Menu.featureList();
                System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");
                option = input.nextLine();
            }
            else if(option.equals("2")){
                ArrayList<String> finalList = Menu.account(ans);

                String iteration1="";


                //prints string of input
                if(option1){
                    for (String s : finalList) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }


                //check for brackets
                for (int counter = 0; counter < finalList.size(); counter++) {
                    if (finalList.get(counter).equals("(")) {
                        break;
                    }
                    if (counter == finalList.size()-1){
                        if(option1) {
                            System.out.println(Main.bro(finalList, option1));
                        }
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
                                counter++;

                                if(option1){
                                    System.out.println(subList);
                                }

                                iteration1 = Main.bro(subList, option1);
                                if(option1){
                                    System.out.println(Main.bro(subList, option1));
                                }
                                finalList.add(maxcounter, iteration1);
                                finalList.removeIf(s -> s == null || s.isEmpty());
                                if(option1){
                                    System.out.println(finalList);
                                }
                            }
                        }
                    }


                }
                Main.bro(finalList, option1);
                if(!option1){
                    System.out.println(finalList.getFirst());
                }

                ans = finalList.getFirst();
                System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");
                option = input.nextLine();
            }


            else if (option.equals("3")) {
                BinaryCalculator.runBinaryCalculator();
                System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");
                option = input.nextLine();
            }

            else if(option.equals("4")){
                option1 = Menu.options();
                System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");
                option = input.nextLine();
            }


            else{
                System.out.println("Welcome\n1 - Feature list\n2 - Arithmetic Calculator\n3 - Binary Calculator\n4 - Options\n");

                option = input.nextLine();
            }
        }
    }
}