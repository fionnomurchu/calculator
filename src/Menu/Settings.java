package Menu;

import java.util.Scanner;

public class Settings extends MenuItems {

    // Attribute to track the step-by-step solution state
    private boolean stepByStepEnabled;

    // Constructor to initialize the default value
    public Settings() {
        this.stepByStepEnabled = false; // Disabled by default
    }

    // Getter for the current option state
    public boolean isStepByStepEnabled() {
        return stepByStepEnabled;
    }

    // Method to toggle the step-by-step solution state
    @Override
    public void display() {
        Scanner input = new Scanner(System.in);

        if (!stepByStepEnabled) {
            System.out.println("1 - Enable step-by-step solution");
            String userInput = input.nextLine();
            if (userInput.equals("1")) {
                stepByStepEnabled = true;
                System.out.println("Step-by-step solution enabled");
            }
            else {
                System.err.println("Invalid input, no changes made");
            }

        } else {
            System.out.println("1 - Disable step-by-step solution");
            String userInput = input.nextLine();
            if (userInput.equals("1")) {
                stepByStepEnabled = false;
                System.out.println("Step-by-step solution disabled");
            }
            else {
                System.err.println("Invalid input, no changes made");
            }
        }
    }
}
