package Calculate;
/* 11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/


import java.util.LinkedList;

public class Question11 {

    String name1 = "Ripti";

    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Kinjal");
        name.add("Sikha");
        name.add("Nayan");
        name.add("Avani");
        name.add("Kushbu");
Question11 q = new Question11();

//System.out.println(q.name1);

        for (String a : name) {
            if (a.equalsIgnoreCase(q.name1)) {
                System.out.println(q.name1);
            }
        }
    }
}





