import java.util.Scanner;

public class FunctionQuestions {
    public static void main(Stringss[] args) {
        
        Scanner in = new Scanner(System.in);

        // System.out.println("Enter a number");
        // int N = in.nextInt();
        // boolean ans = isPrime(N);
        // System.err.println("The number entered is prime: " + "It's " + ans);

        System.out.println("the armstrong number between 100 to 1000 are :");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /* To check if a number is prime or not
    static boolean isPrime (int n) {
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    */


    //To print all 3 digits armstrong numbers
    static boolean isArmstrong (int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        return sum == original; 
    }
}
