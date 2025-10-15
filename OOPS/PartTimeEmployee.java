package OOPS;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
	private int hourlyrate;
	private int totalSalary;
	
	public void set_hourlyrate(int h_rate) {
		hourlyrate = h_rate;
	}
	public void set_hoursWorked(int h_work) {
		hoursWorked = h_work;
	}
	
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		totalSalary = hourlyrate * hoursWorked;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type: Part time");
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + empId);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Hourly Rate: " + hourlyrate);
		System.out.println("Total Salary: " + totalSalary);
	}
}
