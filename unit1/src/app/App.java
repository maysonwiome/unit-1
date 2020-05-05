package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        System.out.println("How many inches are in a foot");
        String inchesInAFoot = input.nextLine();
        if (inchesInAFoot.equals(12));
        System.out.println("correct");

        System.out.println("Whats the capital");
        String capitalOfMinnesota = input.nextLine();
        if (capitalOfMinnesota.equals(12))
        System.out.println("inncorect");

        System.out.println("what year is it");
        String year = input.nextLine();
        System.out.println("correct");
    }
}