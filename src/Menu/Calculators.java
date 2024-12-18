package Menu;

import java.util.Scanner;

public class Calculators extends MenuItems {
    @Override
    //method to display calculator options
    public void display() {
        System.out.println("--------------------");//seperator
        System.out.println("1 - Arithmetic Calculator\n2 - Programming Calculator\n3 - Unit Converter\n4 - Matrix Calculator");
        System.out.println("--------------------");//seperator
    }
//method to get users choice 
    public String calculatorChoice() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();//returns users input as string
    }
//place holder method to be implemented for running a calculator,left empty too allow overriding from specific calculators
    public void runCalculator(){

    }
}
