package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        System.out.println("mr o liked to ");
        String noun = input.nextLine();
        System.out.println("mr o liked to" + noun);

        System.out.println("likes video games");
        String name = input.nextLine();
        System.out.println( name + "likes video games");

        System.out.println("people like to watch");
        String tvShow = input.nextLine();
        System.out.println("people like to watch" + tvShow);

        System.out.println("my spanish teacher has a pet");
        String animal = input.nextLine();
        System.out.println("my spanish teacher has a pet" + animal);
       
    }
}