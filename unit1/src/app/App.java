package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Dog dog1 = new Dog();
      Dog dog2 = new Dog();
      Dog dog3 = new Dog();

      Scanner input = new Scanner(System.in);

      dog1.name = "jerry"
      dog1.breed = "Pitbull";
      dog1.age = "2";

      System.out.println(dog1.name);
      System.out.println(dog1.breed);
      System.out.println(dog1.age);




       
    }
}