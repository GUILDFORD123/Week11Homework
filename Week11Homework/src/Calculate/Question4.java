package Calculate;
/*4. Write a Java program to iterate through all elements in an array list using
Iterator.*/


import java.util.ArrayList;
import java.util.Iterator;

public class Question4 {

    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("list 1");
        elements.add("list 2");
        elements.add("list 3");

        System.out.println("arraylist");

        Iterator<String> its = elements.iterator();
        while (its.hasNext()){
            String elements1 = its.next();
            System.out.println(elements1);
        }
    }

}
