package OOPS;

public class Test {
    //Many classes will be called in this file

    public static void main(String[] args) {
    
        //Calling a class and creating objcets with default constructors
        FCBarcelona raphina = new FCBarcelona();
        raphina.player_name = "Raphina";
        raphina.player_position = "LW/CAM";
        raphina.status = "Active";
        System.out.println(raphina);

        FCBarcelona lamine = new FCBarcelona();
        lamine.player_name = "Lamine Yamal";
        lamine.player_position = "RW";
        lamine.status = "Active";
        System.out.println(lamine);

        FCBarcelona pedri = new FCBarcelona();
        pedri.player_name = "Pedri";
        pedri.player_position = "CM";
        pedri.status = "Active";
        System.out.println(pedri);

        FCBarcelona iniesta = new FCBarcelona();
        iniesta.player_name = "Andres Iniesta";
        iniesta.player_position = "CM";
        iniesta.status = "Retired";
        System.out.println(iniesta);
        
        
        //Calling a class and creating objects with parameterized constructors
        UCL rm = new UCL("Real Madrid CF", 15);
        UCL acm = new UCL("AC Milan", 7);
        UCL fcbm = new UCL("FC Bayern Munich", 6);
        UCL fcb = new UCL("FC Barcelona", 5);
        UCL lvpl = new UCL("Liverpool", 6);
        

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


        //Employee details class: Has various fields such as id, name and salary, also a giveRaise method is created.
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.set_emp_id(45);
        emp1.set_emp_name("John");
        emp1.set_salary(50000);

        emp1.giveRaise(5);

        System.out.println("Employee ID: " + emp1.get_emp_id());
        System.out.println("Employee name: " + emp1.get_emp_name());
        System.out.println("Employee Salary: " + emp1.get_salary());


    }
}
