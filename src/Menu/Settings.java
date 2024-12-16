package Menu;

import java.util.Scanner;

public class Settings extends MenuItems {

    public boolean options(boolean lastOption){
        boolean option1 = lastOption;
        Scanner input = new Scanner(System.in);
        String optionInput;

        //Option 1 allows you to either disable or enable Step-by-step solution based on its current state
        //Set to disabled by default
            if(!option1){
                System.out.println("1 - Enable step-by-step solution ");
                optionInput = input.nextLine();
                if(optionInput.equals("1")){
                    option1 = true;
                    System.out.println("Enabled");
                    System.out.println("--------------------");
                }
            }
            else{
                System.out.println("1 - Disable step-by-step solution ");
                optionInput = input.nextLine();
                if(optionInput.equals("1")){
                    option1 = false;
                    System.out.println("Disabled");
                    System.out.println("--------------------");
                }
            }
        //returns boolean to state if step-by-step solution is enabled or disabled
        return option1;
    }
}
