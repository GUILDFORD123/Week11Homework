package Calculate;
/*5. Write a Java program to test an array list is empty or not. Define array list with
underground tube names */


import java.util.ArrayList;

public class Question5 {

    public static void main(String[] args) {
        ArrayList<String> underground = new ArrayList<String>();

        underground.add("Cental line");
        underground.add("Bakerloo");
        underground.add("Piccadilli");
        underground.add("Victoria");

        if (underground.isEmpty()){
            System.out.println("The underground name list is empty");

        }else {
            System.out.println("The underground name list is not empty");
        }
    }
}
