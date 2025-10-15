package OOPS;

public class FullTimeEmployee extends Employee{
    private int bonus = 2500;
	private int baseSalary;
	private int totalSalary;
	
	public void set_baseSalary(int base_salary) {
		baseSalary = base_salary;
	}
	
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		totalSalary = baseSalary + bonus;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type: Full time");
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + empId);
		System.out.println("Base salary: " + baseSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + totalSalary);
	}
}
