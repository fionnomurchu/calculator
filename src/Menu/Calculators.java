package Menu;

import java.util.Scanner;

public class Calculators extends MenuItems {
    @Override
    public void display(){
        System.out.println("1 - Arithmetic Calculator\n2 - Binary Calculator\n3 - Unit Converter\n4 - Algebra Calculator");
    }

    public String calculatorChoice(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
