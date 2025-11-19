package examen2014;

public class Main {
    public static void main(String[] args) {
    	Personne p1 = new Personne(20, 158, "Ghofrane");
        Personne p2 = new Personne(17, 175, "yesmine");
        Personne p3 = new Personne(25, 170, "slimen");
        
        ConditionAge c1 = new ConditionAge(13);  
        ConditionAge c2 = new ConditionAge(18);
        
        Attraction a1 = new Attraction("Grande roue",11, c1);
        Attraction a2 = new Attraction("Toboggans", 15, c2);
        
        ParcAttraction parc = new ParcAttraction("Parc Tunis", 8);
        
        parc.ajouteAttraction(a1);
        parc.ajouteAttraction(a2);

        
        a1.utilise(p1);  
        a1.utilise(p2); 
        a1.utilise(p3); 

        a2.utilise(p1);  
        a2.utilise(p2);  
        a2.utilise(p3);  

        
        parc.affiche();
    }

    
}
