/*package Calcuators;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgebraCalculator {
    public static void runAlgebraCalculator(){
        String ans = "0";
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Quadratic Equations \n2 - Simultaneous Equations");


        String option = input.nextLine();

        while (true){
            if(option.equals("1")){
                ArrayList<String> quadratic = Menu.account(ans);
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
                break;
            }
            else{
                System.out.println("Invalid input, Try again:");
                option = input.nextLine();
            }
        }
    }
}*/
