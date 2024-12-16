import Calcuators.ArithmeticCalculator;
import Calcuators.ArithmeticCalculatorInput;
import Calcuators.ProgrammingCalculator;
import Calcuators.UnitConverterCalculator;
import Menu.Calculators;
import Menu.MenuItems;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcCaller {
    public void calcCaller(){
        Scanner input = new Scanner(System.in);
        String ans = "";

        MenuItems calculators = new Calculators();

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        Calculators programmingCalculator = new ProgrammingCalculator();
        Calculators unitConverterCalculator = new UnitConverterCalculator();
        Calculators calculatorChoice = new Calculators();

        String calcChosen = calculatorChoice.calculatorChoice();

        switch (calcChosen) {
            case "1":
                ArrayList<String> finalList = ArithmeticCalculatorInput.input(ans);
                boolean option1 = false;
                String result = arithmeticCalculator.arithmeticCalculations(finalList, option1);
                System.out.println(result);
                break;
            case "2":
                programmingCalculator.runCalculator();
                break;
            case "3":
                unitConverterCalculator.runCalculator();
                break;
            default:
                System.err.println("Invalid input");
                calculators.display();
                calcCaller();
                break;
        }
    }
}
