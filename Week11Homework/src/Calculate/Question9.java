package Calculate;
/*9. Write program and add all group names in to array and iterates through for
each loop.*/


import java.util.ArrayList;
import java.util.Iterator;

public class Question9 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Ripti");
        name.add("Kinjal");
        name.add("Sikha");
        name.add("Kushbu");
        name.add("Nayan");
        name.add("Avani");

        System.out.println(name);
        for (String a : name) {
            System.out.println(a);
            }
        Iterator<String> iterator = name.iterator();

        }
    }


