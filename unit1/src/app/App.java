package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int a = 1; a <= 10; a ++ ){
            System.out.println(a);
            if ( a == 5){
                System.out.println("five");
            }
        }
        System.out.println("first loop done");

        for (int b = 100; b <= 200; b + 10){
            System.out.println(b);
            if (b == 150){
                for (b = 150; b <= 159; b ++ ){
                    System.out.println(b);
                }
            }
        }
    }
}