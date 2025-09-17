import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        
        // func(45);
        // func("hello");

        // sum("Hellow", "Peeps");
        // sum(5, 5);

        //manyargs(1,2,3,4,5,6,9);
        //manyargs("1","2","3","4", "Bye", "All");
    }

    /* 
    static void func (int a) {
        System.out.println(a);
    }

    static void func (String s) {
        System.out.println(s);
    }
    */

    /* Adding strings and numbers with fucntion overloading
    static void sum (int a, int b) {
        System.out.println(a+b);
    }
    static void sum (String a, String b) {
        System.out.println(a + " " + b);
    }
    */

    /*Function overloading with variable arguments 
    static void manyargs (int ...i) {
        System.out.println(Arrays.toString(i));
    }
    static void manyargs (String ...s) {
        System.out.println(Arrays.toString(s));
    }
    */
}
