import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        //sum();
        
        //hello();

        // int ans = sum2();
        // System.out.println("The sum is " + ans);

        // String message = greet();
        // System.out.println(message);

        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter 1st number: ");
        // int num1 = in.nextInt();
        // System.out.println("Enter 2nd number: ");
        // int num2 = in.nextInt();
        // int ans = sum3(num1, num2);
        // System.out.println(ans);

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String firstname = in.next();
        // String personal = greetings(firstname);
        // System.out.println(personal);
    }

    //Basic Syntax
    
    /*  returntype name (arguments) {
        body
        return statement;
     }
    */

    /* Function to print hello world
    static void hello () {
        System.out.println("Hello_World_!!!");
    }
    */


    /* Function to perform sum of 2 numbers
    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is  " + sum);
    }
    */

    /* Function to perform sum of 2 numbers with int returntype 
    static int sum2 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    */

    /*Function of greeting with string returntype 
    static String greet () {
        String greetings = "Hey, how are you ?";
        return greetings;
    }
    */

    /*Function of sum with arguments
    static int sum3 (int a, int b) {
        int sum = a + b;
        return sum;
    }
    */

    /*Function of greeting with string argument 
    static String greetings (String name) {
        String msg = "Hello " + name + " !!!";
        return msg;
    }
    */
    
}