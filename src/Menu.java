import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<String> account() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sum: ");
        String a = input.nextLine();
        String[] stringArray = a.split("");

        ArrayList<String> finalList = new ArrayList<>();
        String value = "";
        String checker = "";

        for (String s : stringArray) {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9") || s.equals(".")
                    || s.equals("-") & value.isEmpty()
                    & !checker.equals("1")) {
                value += s;

            } else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/"))
                    || (s.equals("^")) || (s.equals("!"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "";

            } else if (s.equals("(") || (s.equals(")"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "1";

            } else {
                System.out.print("Invalid input\n");
                finalList = Menu.account();

                break;
            }
        }
        finalList.add(value);

        return finalList;
    }
}
