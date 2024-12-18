//import statements for importing Calculator classes and menu funtionality
import Calculators.ArithmeticCalculator;
import Calculators.ArithmeticCalculatorInput;
import Calculators.ProgrammingCalculator;
import Calculators.UnitConverterCalculator;
import Calculators.MatrixCalculator;
import Menu.Calculators;
import Menu.MenuItems;
import Menu.Settings;

import java.util.ArrayList;
import java.util.Scanner;
//class responsible for handling Calculations 
public class CalcCaller {

    private String ans = "";
    private final Settings settings; // Use the shared Settings instance

    public CalcCaller(Settings settings) {
        this.settings = settings; // Constructor takes the shared Settings instance
    }

    public void calcCaller(){
        Scanner input = new Scanner(System.in);

        MenuItems calculators = new Calculators();

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        Calculators programmingCalculator = new ProgrammingCalculator();
        Calculators unitConverterCalculator = new UnitConverterCalculator();
        Calculators matrixCalculator = new MatrixCalculator();
        Calculators calculatorChoice = new Calculators();

        String calcChosen = calculatorChoice.calculatorChoice();
        //switch statement used to select choice
        switch (calcChosen) {
            case "1":
                ArrayList<String> finalList = ArithmeticCalculatorInput.input(ans);
                boolean option1 = settings.isStepByStepEnabled();
                ans = arithmeticCalculator.arithmeticCalculations(finalList, option1);
                break;
            case "2":
                programmingCalculator.runCalculator();
                break;
            case "3":
                unitConverterCalculator.runCalculator();
                break;
            case "4":
                matrixCalculator.runCalculator();
                break;
            default://handeles invalid inputs
                System.err.println("Invalid input");
                calculators.display();//redisplays calculator menu
                calcCaller();//restarts selection process
                break;
        }
    }
}
