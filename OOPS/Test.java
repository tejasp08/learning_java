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
        
    }
}
