/*package Calcuators;

import java.util.ArrayList;
import java.util.Scanner;
//method to run algebra calculator
public class AlgebraCalculator {
    public static void runAlgebraCalculator(){
        String ans = "0";
        Scanner input = new Scanner(System.in);
        //displays algebra options
        System.out.println("1 - Quadratic Equations \n2 - Simultaneous Equations");


        String option = input.nextLine();
//loop to run code until user makes a valid choice
        while (true){
            if(option.equals("1")){
                ArrayList<String> quadratic = useless.Menu.account(ans);
                System.out.println(quadratic);
                break;
            }
            else if(option.equals("2")){
                System.out.println("How many variables are you solving for? ");
                int amount = input.nextInt();
                input.nextLine();

                for(int i = 1; i <=  amount; i++){
                    System.out.print("Enter equation " + i + ": ");
                    String equations = input.nextLine();
                    System.out.println(equations);
                }
                break;//exits when loop is finished 
            }
            else{//error handling for invalid input
                System.out.println("Invalid input, Try again:");
                option = input.nextLine();
            }
        }
    }
}*/
