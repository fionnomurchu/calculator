//Imports necessary classes for menu and calculator operations
import java.util.Scanner;
import Menu.MenuItems;
import Menu.FeatureList;
import Menu.Settings;
import Menu.Calculators;
//main class that acts as the entry point of the program
public class Main {
//main method that runs the program
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean option1 = true;
//initialize menu and calcCaller
        MenuItems menu = new MenuItems();
        MenuItems featureList = new FeatureList();
        MenuItems calculators = new Calculators();
        Settings settings = new Settings();
        CalcCaller calcCaller = new CalcCaller();

        label:
        while (true){
            menu.display();//displays main menu
            String option = input.nextLine();//reads user input 
//switch statement to handle users selection
            switch (option) {
                case "1":
                    featureList.display();
                    break;
                case "2":
                    calculators.display();
                    calcCaller.calcCaller();
                    break;
                case "3":
                    settings.display();
                    break;
                case "4":
                    break label;
                default://error handling for invalid input
                    System.err.println("Invalid input");
                    menu.display();//redisplays menu
                    break;
            }
        }
    }
}
