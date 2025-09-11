import java.util.Scanner;


public class Arrays {
    public static void main(Stringss[] args) {
        
        //datatype[] varname = new datatype[size];
        /* int[] rollno = new int[5]; */
        
        //OR
        
        /* int[] rollno2 = {12,45,69,78,63}; */

        //System.out.println(rollno[2]);

        // String[] s = new String[4];
        // System.out.println(s[1]); //Will give null

        /* 
        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 42;
        arr[2] = 36;
        arr[3] = 46;
        arr[4] = 78;

        System.out.println(arr[2]);
        */

        //Using for loop
        // Scanner in = new Scanner(System.in);
        /*
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        */
        /* 
        for (int j : num) {                 //Enhanced for loop:D
            System.out.print(j + " ");
        }
        */

        //String Array
        /* 
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            System.out.print(str[i] + " ");
        }
        */

        /* 
        //Checking mutability
        int[] nums = {10,7,11,45,8};
        System.out.println(java.util.Arrays.toString(nums));
        mutable(nums);
        System.out.println(java.util.Arrays.toString(nums));
        System.out.println(java.util.Arrays.toString(nums));
        */
    }

    //Mutable function
    /* 
    static void mutable(int[] arr) {
        arr[0] = 99;
    }
    */
}
