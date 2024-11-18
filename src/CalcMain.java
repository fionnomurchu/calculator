import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        String a = input.nextLine();

        String[] stringArray = a.split("");


        List<String> finalList = new ArrayList<>();
        String value="";

        for (String s : stringArray) {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9")
            ) {
                value += s;
            }
            else if (s.equals("+")) {
                finalList.add(value);
                finalList.add("+");
                value = "";
            }
            else if (s.equals("-")) {
                finalList.add(value);
                finalList.add("-");
                value = "";
            }
            else if (s.equals("*")) {
                finalList.add(value);
                finalList.add("*");
                value = "";
            }
            else if (s.equals("/")) {
                finalList.add(value);
                finalList.add("/");
                value = "";
            }
        }
        finalList.add(value);

        for (String s : finalList) {
            System.out.print(s + " ");
        }
    }
}
