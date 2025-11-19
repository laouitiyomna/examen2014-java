package examen2014;

public class ParcAttraction {
	 private String nom;
	    private Attraction[] lesAttractions;
	    private int nb_attra;
	    
	    public ParcAttraction(String nom, int taille) {
	        this.nom = nom;
	        this.lesAttractions = new Attraction[taille];
	        this.nb_attra = 0;
	    }
	    
	    public void ajouteAttraction(Attraction a) {
	        if (nb_attra < lesAttractions.length) {
	            lesAttractions[nb_attra] = a;
	            nb_attra=nb_attra+1;
	        } else {
	            System.out.println("pleine !");
	        }
	    }
	    
	    public float getRecette() {
	        float total = 0;
	        for (int i = 0; i < nb_attra; i++) {
	            total = total + lesAttractions[i].getRecette();
	        }
	        return total;
	    }
	    
	    
	    public void affiche() {
	        System.out.println("Parc : " + nom);
	        System.out.println("Les attractions :");

	        for (int i = 0; i < nb_attra; i++) {
	            lesAttractions[i].affiche();
	        }

	        System.out.println("Recette totale du parc : " + getRecette());
	    }
}
