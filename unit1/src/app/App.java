package app;

public class App {
    public static void main(String[] args) throws Exception {

        for (int a = 20; a >= 0; a + -a) {
            System.out.println(a);
            if (a == 10) {
                for( int j = 0; j < 5; j + -j){
                    System.out.println(a);
                }
            }
        }
          System.out.println("first loop done");  

          for ( int b = 4; b <= 36; b ++) {
              System.out.println(b);
          }

      
    }
}