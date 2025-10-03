package OOPS;

public class UCL {
    
    String club_name;
    int ucl_trophies;
    final String trophy = "🏆";

    //Parameterized constructor
    public UCL (String club_name , int ucl_trophies) {
        this.club_name = club_name;
        this.ucl_trophies = ucl_trophies;
        System.out.println("Club: " + club_name + ", UCL's: " + ucl_trophies + trophy);
    }

}
