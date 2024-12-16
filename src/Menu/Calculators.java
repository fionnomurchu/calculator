package Menu;

import Calcuators.ArithmeticCalculator;
import Calcuators.ArithmeticCalculatorInput;
import Calcuators.ProgrammingCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculators extends MenuItems {
    @Override
    public void display() {
        System.out.println("1 - Arithmetic Calculator\n2 - Programming Calculator\n3 - Unit Converter\n");
    }

    public String calculatorChoice() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void runCalculator(){

    }
}
