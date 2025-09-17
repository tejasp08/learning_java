import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        /* 
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        */
        //Variable length in individual column
        /* 
        int[][] arr2 = {
            {1,2,3},    //0th index
            {4,5},      //1st index
            {7,8,9},    //2nd index
        };
        */

        //Through Input
        // int[][] arr = new int[3][3];

        // Scanner in = new Scanner(System.in);

        // for (int row = 0; row < arr.length; row++) {    
        //     //for every rows
        //     for (int col = 0; col < arr[row].length; col++) {
        //         //for every column
        //         arr[row][col] = in.nextInt();
        //     }
        // }
        //for printing
        // for (int row = 0; row < arr.length; row++) {    
        //     //for every rows
        //     for (int col = 0; col < arr[row].length; col++) {
        //         //for every column
        //         System.out.print(arr[row][col] + " "); 
        //     }
        //     System.out.println();
        // }

        //Using toString for output
        // for (int row = 0; row < arr.length; row++) {    
        //     System.out.println(java.util.Arrays.toString(arr[row]));
        // }
        
        //Using enhanced for loop
        // for(int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }

        //Printing array of variable column length
        /* 
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        */
    }
}
