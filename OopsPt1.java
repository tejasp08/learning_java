class Employee {
    int empId = 2;
    static int salary = 20000;
    private int incentive = 350;
    void CalculateSalary() {
        System.out.println(salary + incentive);
    }
}

public class OopsPt1 {
    
    public static void main(String[] args) {
        Employee engineer = new Employee();
        //System.out.println(engineer.salary);  //by creating a object and then accessing the attribute
        System.out.println(engineer.empId);
        System.out.println(Employee.salary);    //accessing through static variable
        //System.out.println(engineer.incentive); //implementing private access modifier

        
    }
}
