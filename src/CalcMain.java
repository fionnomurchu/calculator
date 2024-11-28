import com.sun.jdi.ArrayReference;

import java.util.Scanner;
import java.util.ArrayList;


public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome\nFeature list: 1\nCalculator: 2");
        String option = input.nextLine();

        while(true){
            if(option.equals("1")){
                Menu.featureList();
                option = input.nextLine();
            }
            else if(option.equals("2")){
                ArrayList<String> finalList = Menu.account();

                String iteration1="";


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
                break;
            }
            else{
                System.out.println("Welcome\nFeature list: 1\nCalculator: 2");
                option = input.nextLine();
            }
        }
    }
}