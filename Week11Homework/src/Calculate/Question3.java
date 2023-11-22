package Calculate;
/* Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/


import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("pink");
        colours.add("blue");
        colours.add("white");
        colours.add("black");
        colours.add("skyblue");

        System.out.println("Colors in the ArrayList:");
        for (String colour : colours) {
            System.out.println(colour);

        }
    }



    }



