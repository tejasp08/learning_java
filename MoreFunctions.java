import java.util.Scanner;

public class MoreFunctions {
    public static void main(Stringss[] args) {
        Scanner in = new Scanner(System.in);

        //Max and min from 3 numbers
        // System.out.println("Enter 3 numbers: ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // int n3 = in.nextInt();

        // System.out.println("The max and min from 3 nos. is: ");
        // System.out.print(maximum(n1, n2, n3) + " & " + minimum(n1, n2, n3));

        //To check even or odd
        // System.out.println("enter a number to check if its even or odd: ");
        // int n = in.nextInt();
        // evenodd(n);

        //Voter eligibility
        // System.out.println("Enter your age");
        // int age = in.nextInt();
        // votereligibilty(age);

        //Sum of two nos.
        // System.out.println("Enter two numbers: ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // sum(n1,n2);

        //Product of two nos.
        // System.out.println("Enter two numbers: ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // product(n1,n2);

        //Circumference and Area of circle
        // System.out.println("Enter radius of a circle: ");
        // float r = in.nextFloat();
        // circumference(r);
        // //System.out.println();
        // area(r);

        //Factorial till n number
        // System.out.println("Enter a number for factorial: ");
        // int n = in.nextInt();
        // factorial(n);

        //To check if a number is palindrome or not
        // System.out.println("Enter a number: ");
        // int n = in.nextInt();
        // if (palindromeornot(n) == true) {
        //     System.out.println("Its a palindrome");
        // } else {
        //     System.out.println("Its not palindrome");
        // }

        //To check if numbers are pythagorean triplets
        // System.out.println("Enter 3 number: ");
        // int n1 = in.nextInt();
        // int n2 = in.nextInt();
        // int n3 = in.nextInt();
        // pythagoreantriplet(n1,n2,n3);

        //To find the sum of n natural nos
        System.out.println("Enter a natural number: ");
        int n = in.nextInt();
        System.out.print("Sum till " + n + " is: ");
        sumofn(n);
    }

    //Max and min
    static int maximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max =c;
        }
        return max;
    }
    static int minimum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min =c;
        }
        return min;
    }

    //Odd or Even
    static void evenodd (int num) {
        if (num % 2 == 0) {
            System.out.print("Its even");
        } else {
            System.out.print("Its odd");
        }
    }

    //Voter eligibility
    static void votereligibilty (int n) {
        if (n >= 18 && n <= 100) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    //Sum of two nos.
    static void sum (int a, int b) {
        System.out.println("Sum is "+ (a+b));
    }

    //Product of two nos.
    static void product (int a, int b) {
        System.out.println("Product is "+ (a*b));
    }

    //Circumference and Area of circle
    static void circumference (float n) {
        System.out.println("Circumference is " + (2*3.14*n));
    }

    static void area (float n) {
        System.out.println("Area is " + (3.14*n*n));
    }

    //Factorial till n number
    static void factorial (int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact*i;
        }
        System.out.print("Factorial till " + n + " number is: " + fact);
    }

    //To check if a number is palindrome or not
    static boolean palindromeornot (int a) {
        Stringss num = Integer.toString(a);

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    //To check if numbers are pythagorean triplets
    static void pythagoreantriplet (int a, int b, int c) {
        int max = maximum(a, b, c);
        int x = 0;
        int y = 0;
        //finding maximum and assigning other to x and y
        if (max == a) {
            x = b;
            y = c;
        } 
        else if (max == b) {
            x = a;
            y = c;
        }
        else {
            x =a;
            y =b;
        }

        if ((max*max) == (x*x + y*y)) {
            System.out.println("Its a triplet");
        } else {
            System.out.println("Its not a triplet");
        }
    }

    //To find the sum of n natural nos
    static void sumofn (int num) {
        int add = 0;

        for (int i = 0; i <= num; i++) {
            add = add + i;
        }
        
        System.out.println(add);
    }
}
