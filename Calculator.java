import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //To continue the calculator programm till user enters 'x' or 'X'

        int ans = 0;
        while (true) {
            //Taking input for operator
            System.out.print("Enter an operator to perform calculation: ");
            char operator = in.next().trim().charAt(0);

            //Checking if the operator is valid or not
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

                System.out.print("Enter number 1: ");
                int num1 = in.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = in.nextInt();

                //Performing operations
                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    ans = num1 / num2;
                }
                System.out.println(ans);
            } 
            //To terminate the program
            else if (operator == 'x' ||operator == 'X') {
                break;
            } 
            //For invalid operator
            else {
                System.out.println("Inavlid operator");
            }
        }
    }
}
