package Calculate;
/*10. Write program and add all group members names in to array and iterates
through for each loop and print your name.*/


import java.util.ArrayList;

public class Question10 {


    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Ripti");
        name.add("Kinjal");
        name.add("Sikha");
        name.add("Kushbu");
        name.add("Nayan");
        name.add("Avani");

        System.out.println(name);
        for(String a : name){
            if(a.equalsIgnoreCase("Ripti")){
                System.out.println(a);
            }







            }
        }
    }
