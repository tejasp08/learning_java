import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {10, 7, 11, 45, 8, 1};
        //Swapping of two elements
         
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the indices(0-5): ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(arr,a,b);
        System.out.println(Arrays.toString(arr));
        

        
        //Max element of array
        System.out.print("The maximum element from array is: ");
        System.out.print(max(arr));
        

        //Reverse the array
        System.out.println("The reversed array is: ");;
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    //Swap function
    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    //Max element of array
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    //Reversing an array
    static void reverse (int[] arr) {
        int start = 0;
        int end  = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
