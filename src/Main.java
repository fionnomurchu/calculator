import java.util.Scanner;
import Menu.MenuItems;
import Menu.FeatureList;
import Menu.Settings;
import Menu.Calculators;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean option1 = false;

        MenuItems menu = new MenuItems();
        MenuItems featureList = new FeatureList();
        MenuItems calculators = new Calculators();
        Settings settings = new Settings();

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
                    break;
                case "3":
                    option1 = settings.options(option1);
                    break;
                case "4":
                    break label;
                default:
                    System.err.println("Invalid input");
                    menu.display();
                    option = input.nextLine();
                    break;
            }
        }
    }
}
