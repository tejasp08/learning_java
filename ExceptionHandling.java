import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    
    //Exception = unwanted interruption/issue
	//eg. someone takes auto -> railway station, but reaching the station, the train is cancelled. 
	//	  This is unwanted interruption.
	
	//Handling = to manage a task so execution does not stop
	
	//ExceptionHandling: To Handle unwanted issues in program so execution does not stop.
	
	//Exception: 1. Compile time: while writing the program 2. Run time: after running the program
	//Handling type: 1. try and catch, 2.Throws and 3.Throw

    public static void main(String[] args) {
        
        //Some types of exceptions
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter a numerator: ");
			int n = sc.nextInt();
			System.out.println("enter a denominator: ");
			int d = sc.nextInt();
			
			int c = n/d;
			System.out.println("the result is: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Dont use 0 at denominattor");
			//an Arithmetic exception will occur if we assign 0 as d.
		} catch (InputMismatchException i) {
			System.out.println("use only numbers for divison");
			//If characters or symbols are used instead of integers
		}
		System.out.println("Byee");	
		
		
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Dont assign null");
			//Null pointer exception will occur since null object does not have a length
		}
		
		
		String str1 = "xyz123";
		System.out.println(str1 + 180);		//THis will be executed successfully;
		try {
			int num = Integer.parseInt(str1);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Pls pass a numerical value in num!!");
			//Here a number format exception will occur at Integer.parseInt(str1), since characters are 
			//also present in the string
		}
		
		
		
		try {
			String name = "Robert";
			System.out.println(name.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Use index in range");
			//Here the exception of Index out of bound will occur, since name has 6 characters with indices 
			//from 0 to 5, but it doesnt have a 7th index.
		}
    }
}
