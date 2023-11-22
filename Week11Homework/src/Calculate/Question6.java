package Calculate;
/*6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)*/


import java.util.HashSet;

public class Question6 {

    public static void main(String[] args) {
        HashSet<Integer> ints = new HashSet<Integer>();
        ints.add(4);
        ints.add(7);
        ints.add(8);
        System.out.println("Numbers between 1 and 10 in the set:");

        for (int i = 1; i <= 10; i++) {
            if (ints.contains(i)) {

                System.out.println(ints + "Numbers will print");
            } else {
                System.out.println(ints + " number will not print");
            }

        }


    }
}
