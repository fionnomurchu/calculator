import java.util.Scanner;
import Menu.MenuItems;
import Menu.FeatureList;
import Menu.Settings;
import Menu.Calculators;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean option1 = true;

        MenuItems menu = new MenuItems();
        MenuItems featureList = new FeatureList();
        MenuItems calculators = new Calculators();
        Settings settings = new Settings();
        CalcCaller calcCaller = new CalcCaller();

        label:
        while (true){
            menu.display();
            String option = input.nextLine();

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
                default:
                    System.err.println("Invalid input");
                    menu.display();
                    break;
            }
        }
    }
}
