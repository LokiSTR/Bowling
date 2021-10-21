public class Bowling {
    
    int[] bahnen = {3, 5, 9, 4, 7, 2, 6};

    public void persAnzahlPruef(int a){
        
        int i = bahnen[a];

        if (a >= 0 && a <= 6){
            System.out.println("Diese Bahn ist vergeben");
        }
        else if (a < 0 || a > 6){
            System.out.println("Diese Bahn ist nicht vergeben");   
        }
        
        if (i > 5  ){
            System.out.println("große Gruppe");
        }
        else {
            System.out.println("kleine Gruppe");
        }           

        

    }

}
