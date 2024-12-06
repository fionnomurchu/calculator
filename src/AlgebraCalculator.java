import java.util.Scanner;

public class AlgebraCalculator {
    public static void runAlgebraCalculator(){
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Quadratic Equations \n2 - Simultaneous Equations");


        String option = input.nextLine();

        while (true){
            if(option.equals("1")){
                System.out.println("Enter your equation: ");
                String quadratic = input.nextLine();
                System.out.println(quadratic);
                break;
            }
            else if(option.equals("2")){
                System.out.println("How many variables are you solving for? ");
                int amount = input.nextInt();

                for(int i = 0; i < amount; i++){
                    System.out.println("Enter equation " + i);
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
}
