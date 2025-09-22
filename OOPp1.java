public class OOPp1 {
    public static void main(String[] args) {
        
        //class syntax
        /* 
        class ClassName {
        
            //code
        }
        */

        //accessing the values from Student class, will give 0 and null
        Student alex = new Student();   //DEFAULT CONSTRUCTOR
        System.out.println(alex.rollno);
        System.out.println(alex.name);

        //many more student objects can be created via Student class
        Student tejas = new Student(63,"tejas", 84.55f);   
        System.out.println(tejas.name);
        System.out.println(tejas.rollno);

        
    }

    
}




//creating a class of student that takes rollno, name and marks
class Student  {
        
        int rollno;
        String name;
        float marks;
        
        Student (int rollno, String name, float marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }

        Student () {
            rollno = 46;
            name = "unkown";
            marks = 0.00f;
        }
}


