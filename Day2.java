public class Day2 {
    public static void main(Stringss[] args) {
        
        //Conditionals if-else
        int salary = 25000;
        if (salary>10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println("the new salary is " + salary);

        //Multiple if-else
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println("the new salary is " + salary);
    }
}
