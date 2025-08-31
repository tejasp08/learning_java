import java.util.Scanner;

public class SomeQuestions {
    public static void main(String[] args) {
        //Largest of 3 numbers
        Scanner in = new Scanner(System.in);

        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();

        // int max = a;
        // if (b > max) {
        //     max = b;
        // } 
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println(max);


        //To check if a character is in upper or lowercase
        //char ch = in.next().trim().charAt(0); //taking a single character as input, .trim() is used to delete extra space
        
        // if (ch >= 'a' && ch <= 'z') {
        //     System.out.println("Lowercase");
        // } else {
        //     System.out.println("Uppercase");
        // }


        //Fibonacci series till Nth number
        // int n = in.nextInt();
        // int n1 = 0;
        // int n2 = 1;

        // for (int i = 0; i <= n; i++) {
        //     System.out.print(n1 + " ");
        //     int n3 = n1 + n2;
        //     n1 = n2;
        //     n2 = n3;
        // }

        
        //Printing Nth Fibonacci number 
        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count  = 2;

        // while (count <= n) {
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);

        //To check the repeating number in given number
        // String N = in.next();
        // System.out.println("Enter number you want check: ");
        // char n = in.next().trim().charAt(0);

        // int count = 0;
        // for (int i = 0; i < N.length(); i++) {
            
        //     if (n == N.charAt(i)) {
        //         count += 1;
        //     } else {
        //         count += 0;
        //     }
        // }
        // System.out.println(n + " is repeated " + count + " time");

        //Reverse a number
        // System.out.println("Enter number you want to reverse: ");
        // int N = in.nextInt();
        // System.out.println("The reversed number is: ");

        // while (N != 0) {
        //     int rev = N % 10;
        //     N /= 10;
        //     System.out.print(rev);
        // }
    }
}
