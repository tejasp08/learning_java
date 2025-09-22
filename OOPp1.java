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

        //acessing the values from Goat class
        Goat star = new Goat("John Cena", 17, "WWE HOF, Legend");
        System.out.println(star.name);
        System.out.println(star.champ);
        System.out.println(star.status);
        star.slogan();
    }

    
}




//creating a class of student that takes rollno, name and marks (DEFAULT CONSTRUCTOR)
class Student  {
        
        int rollno;
        String name;
        float marks;
        
        //these values need to be added in order to be accessed('this' keyword is used)
}

class Goat {
    String name;
    int champ;
    String status;

    //making constructor and giving it parameters
    Goat(String name, int champ, String status) {
        this.name = name;
        this.champ = champ;
        this.status = status;

    }

    void slogan () {
        System.out.println("You Can't See Me!!!");
    }
}
