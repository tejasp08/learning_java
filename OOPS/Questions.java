package OOPS;

public class Questions {

//Create a Java class 'Student' with attributes name, roll number, and marks. Write methods to input and display student details.
		/*
		import java.util.Scanner;
		public class Student {
			String name;
			int rollno;
			int marks;
			
			public void input_details() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name of student: ");
				name = sc.next();
				System.out.println("Enter roll no. of student: ");
				rollno = sc.nextInt();
				System.out.println("Enter marks of student: ");
				marks = sc.nextInt();
			}
			
			public void display_details() {
				System.out.println("Name: " + name);
				System.out.println("Roll No.: " + rollno);
				System.out.println("Marks: " + marks);
			}
		}
		
		public static void main(String[] args) {
			Student s1 = new Student();
			s1.input_details();
			s1.display_details();
		}
		*/
		
		
//Write a Java program to demonstrate multilevel inheritance using classes Animal → Mammal → Human.
	/* 
	public class Animal {
    	String species;
		String habitat;
		String diet;
			
		public void eat(String s, String d) {
			species = s;
			diet = d;
			System.out.println(s + " eats " + d + " diet");
		}
	}	

	public class Mammal extends Animal {
    	String blood_type;
		String fur;
		String leg;
			
		public void walk(String species, String l) {
			leg = l;
			System.out.println(species + " species has " + l + " legs");
		}
	}

	public class Human extends Mammal {
    	String name;
			
		public String Characteristic () {
			return name + " is a " + species;
		}
	}

	public static void main(String[] args) {
		Human h = new Human();
		h.species = "Human";
		h.habitat = "Land";
		h.diet = "Non-veg/Veg";
		h.blood_type = "Warm";
		h.fur = "Yes";
		h.leg = "2";
		h.name = "John";
		h.eat("Human", h.diet);
		h.walk(h.species, h.leg);
		System.out.println(h.Characteristic());
	}
		*/


//Write a Java program to implement abstraction using an abstract class 'Vehicle' with abstract methods start() and stop().
		/* 
		public abstract class Vehicle {
    		String name;

    		abstract void start();
    		abstract void stop();
		}

		public class Type extends Vehicle{
    		String name;

    		public void start() {
        		System.out.println(name + " is a starting...");
    		}

    		public void stop() {
        		System.out.println(name + " has stopped");
    		}
		}

		public static void main(String[] args) {
			Type vtype = new Type();
			vtype.name = "Car";
			vtype.start();
			vtype.stop();

			Type vtype1 = new Type();
			vtype1.name = "Truck";
			vtype1.start();
			vtype1.stop();
		}		
		*/

//Write a Java program to demonstrate the use of 'super' keyword to call the parent class constructor and method.
	/* 
	public class Vehicle {
    	String brand;

    	public void engine_sound() {
        	System.out.println(brand + " makes a engine sound...");
    	}

    	public Vehicle(String b) {
        	brand = b;
        	System.out.println("Vehicle brand: " + b);
    	}
	}
	public class Type extends Vehicle{

    	String fuel_type;

    	public Type(String b, String f_t) {
        	super(b);
        	fuel_type = f_t;
        	System.out.println("Fuel type: " + f_t);
    	}

    	public void show_details() {
        	super.engine_sound();
        	System.out.println("This is a " + fuel_type + " vehicle");
    	}
	}

	public static void main(String[] args) {
		Type car = new Type("BMW", "Petrol/Diesal");
		car.show_details();
	}
	*/


//Create a Java class 'BankAccount' that has private data members accountNumber, balance and provides deposit() and withdraw() methods with basic validation.
		/* 
		public class BankAccount {
			private int acc_number;
			private String acc_holder;
			private int balance;

			//Getters
			public int get_acc_number() {
				return acc_number;
			}

			public String get_acc_holder() {
				return acc_holder;
			}

			public int get_acc_balance() {
				return balance;
			}

			//Setters
			public void set_acc_number(int accNumber) {
				acc_number = accNumber;
			}

			public void set_acc_holder(String accHolder) {
				acc_holder = accHolder;
			}

			public void set_acc_balance(int accBalance) {
				balance = accBalance;
			}

			//withdraw and deposit methods
			public void deposit(int amount) {
				if (amount > 0) {
					balance += amount;
					System.err.println("Amount deposited: " + amount);
				} else {
					System.err.println("Amount should be positive");
				}
			}

		public void withdraw(int amount) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.err.println("Amount withdrawed: " + amount);
			}
			else if (amount > balance) {
				System.out.println("Insufficient balance!!!");
			}
			else {
				System.err.println("Amount should be positive");
			}
		}
	}

		//Creating a bank account class and various account objects
        BankAccount account = new BankAccount();
        account.set_acc_number(789456);
        account.set_acc_holder("Alex");
        account.set_acc_balance(45000);

        //display
        System.out.println("Account holder: " + account.get_acc_holder());
        System.out.println("Account No.: " + account.get_acc_number());
        System.out.println("Balance in Account: " + account.get_acc_balance());

        account.deposit(450);
        account.withdraw(250);
        account.deposit(1000);
        account.withdraw(50000);
        System.out.println("Balance in Account: " + account.get_acc_balance());
		*/

}

