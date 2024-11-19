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
        String value="";

        for (String s : stringArray)
        {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9")
            ) {
                value += s;
            }

            else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/")))
            {
                finalList.add(value);
                finalList.add(s);
                value = "";
            }
        }

        finalList.add(value);

        for (String s : finalList)
        {
            System.out.print(s + " ");
        }
        System.out.println();




        //multiply
        for(int counter=0;counter< finalList.size();counter++) {
            if (finalList.get(counter).equals("*")) {
                hello = Calculations.multiply(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);


                finalList.remove(counter + 0);
                finalList.set(counter - 1, hello);
                counter -= counter;


                for (String s : finalList) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }



        //division
        for(int counter=0;counter< finalList.size();counter++) {
            if (finalList.get(counter).equals("/")) {
                hello = Calculations.divide(finalList.get(counter - 1), finalList.get(counter + 1));
                finalList.remove(counter + 0);


                finalList.remove(counter + 0);
                finalList.set(counter - 1, hello);
                counter =0;


                for (String s : finalList) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }

      //addition and subtraction
        for(int counter1=0;counter1< finalList.size();counter1++)
        {

            //addition
            if(finalList.get(counter1).equals("+"))
            {
                hello = Calculations.add(finalList.get(counter1-1),finalList.get(counter1+1));
                finalList.remove(counter1 +0);
                finalList.remove(counter1 +0);
               finalList.set(counter1-1,hello);
               counter1=0;


                for (String s : finalList)
                {
                    System.out.print(s + " ");
                }
                System.out.println();
            }


            //subtraction
            if(finalList.get(counter1).equals("-"))
            {
                hello = Calculations.subtract(finalList.get(counter1-1),finalList.get(counter1+1));
                finalList.remove(counter1 +0);


                finalList.remove(counter1 +0);
                finalList.set(counter1-1,hello);
                counter1=0;

                for (String s : finalList)
                {
                    System.out.print(s + " ");
                }
                System.out.println();

            }

        }









        for (String s : finalList)
        {
            System.out.print(s + " ");
        }




    }
}