package Menu;

import java.util.Scanner;

public class Calculators extends MenuItems {
    @Override
    public void display() {
        System.out.println("--------------------");
        System.out.println("1 - Arithmetic Calculator\n2 - Programming Calculator\n3 - Unit Converter\n4 - Matrix Calculator");
        System.out.println("--------------------");
    }

    public String calculatorChoice() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void runCalculator(){

    }
}
