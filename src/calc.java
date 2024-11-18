import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        String a = input.nextLine();
        System.out.println(a);
        char[] Chararray = a.toCharArray();

        for (char c : Chararray) {
            System.out.print(c + " ");
        }

    }




}
