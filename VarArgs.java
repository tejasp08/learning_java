import java.util.Arrays;

public class VarArgs {
    public static void main(Stringss[] args) {
        //vars(5,4,9,6,7,8,10,25,45,89,45,78,100,456);

        //words("I'm Iron Man", "Genius", "Billionaire", "Philantrophist");

        //mix(10, 7, "Messi", "Ronaldo", "Neymar");
    }

    //Variable length of arguments are passed
    /*
    static void vars (int ...v) {
        System.out.println(Arrays.toString(v));
    }
    */

    //Variable arguments with strings
    /* 
    static void words (String ...w) {
        System.out.println(Arrays.toString(w));
    }
    */

    //Variable arguments with int and string
    /* 
    static void mix (int a, int b, String ...s) {
        System.out.println(a + " & " + b);
        System.out.println(Arrays.toString(s));
    }
    */
}
