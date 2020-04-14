package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count =0;
        String color = "red";
        boolean iLikeCats = false;
        
        while (count <= 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }

            System.out.println("count finished");

        while (color == "red") {
        System.out.println("the color is" + color);
        color = "green";
        }
        
        System.out.println("color is finsished");

        while (iLikeCats = false){
        System.out.println("I like cats");
        iLikeCats = true;
        }

        System.out.println(" cats are done");
        

    }
}