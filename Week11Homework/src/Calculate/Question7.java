package Calculate;
/*7. Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/


import java.util.HashMap;

public class Question7 {

    public static void main(String[] args) {
        HashMap<String,Integer> name = new HashMap<String,Integer>();
        name .put("Ripti" , 1);
        name.put("Milan", 2);
        name.put("Krishna", 3);

        System.out.println(name);

        for (String a : name .keySet()){
            System.out.println(a);




        }




    }


}
