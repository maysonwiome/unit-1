package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        System.out.println("mayson liked to ");
        String noun = input.nextLine();
        System.out.println(" mayson liked to" + noun);

        System.out.println("likes to watch football");
        String name = input.nextLine();
        System.out.println( name + "likes to watch football");

        System.out.println("people like to play");
        String sport = input.nextLine();
        System.out.println("people like to watch" + sport);

        System.out.println("my spanish teacher has a purple");
        String thing = input.nextLine();
        System.out.println("my spanish teacher has a purple " + thing);

        System.out.println(" I have a friend named");
        String name2 = input.nextLine();
        System.out.println("I have a friend named " + name2);

        System.out.println("my dog likes to ");
        String movement = input.nextLine();
        System.out.println("my dog likes to" + movement);

        System.out.println( "i like to eat");
        String food = input.nextLine();
        System.out.println("i like to eat " + food);

        System.out.println("most people sleep at");
        String time = input.nextLine();
        System.out.println("most peopole sleep at" + time);

        System.out.println("Will win the super bowl");
        String footballTeam = input.nextLine();
        System.out.println(footballTeam + "will win the super bowl");
    }
}