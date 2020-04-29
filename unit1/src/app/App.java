package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        System.out.println("please enter password.");
        String correctPassword = input.nextLine();
        System.out.println("thank you" + correctPassword);
        System.out.println("please enter password");
        String incorectPassword = input.nextline();
        System.out.println("sorry" + incorectPassword);
       

    }
}