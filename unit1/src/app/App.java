package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        System.out.println("enter a number ");
        String number = input.nextLine();
        System.out.println( number);
        System.out.println("enter another number");
        String number2 = input.nextLine();
        System.out.println(number + number2);

       
    }
}