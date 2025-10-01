package OOPS;

public class Test {
    //Many classes will be called in this file

    public static void main(String[] args) {
    
        //Calling FCBarcelona class
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
        
    }
}
