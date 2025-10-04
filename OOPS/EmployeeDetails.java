package OOPS;

public class EmployeeDetails {
    private int emp_id;
    private String emp_name;
    private int salary;

    //Getters
    public int get_emp_id() {
        return emp_id;
    }

    public String get_emp_name() {
        return emp_name;
    }

    public int get_salary() {
        return salary;
    }

    //Setters
    public void set_emp_id(int empId) {
        emp_id = empId;
    }

    public void set_emp_name(String empName) {
        emp_name = empName;
    }

    public void set_salary(int empSalary) {
        salary = empSalary;
    }

    //Raise method
    public void giveRaise(float percent) {
        salary = salary + (int)((percent/100)*salary);
        System.out.println("After raise the salary is: " + salary);
    }
}
