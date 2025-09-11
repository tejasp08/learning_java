import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(Stringss[] args) {
        /* 
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //Adding elements
        list.add(45);
        list.add(10);
        list.add(7);
        list.add(11);
        list.add(8);
        list.add(63);
        list.add(46);
        list.add(42);
        list.add(43);
        list.add(40);
        list.add(37);
        list.add(69);

        //Update
        list.set(0, 999);

        //to check a specific element
        System.out.println(list.contains(45));

        //remove element
        list.remove(3);

        System.out.println(list);
        */

        //Through input
        /* 
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());   
        }
        System.out.println(list);
        */

        //Multidimensional arraylist
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
