package examen2014;

public class Attraction {
	private String nom;
	private float cout;
	private ConditionAge conditionA ;
	private int nbPersonnes=0;
    private float recette=0;
	public Attraction(String nom, float cout, ConditionAge conditionA) {
		this.nom = nom;
		this.cout = cout;
		this.conditionA = conditionA;
	
	}
	
	 public void utilise(Personne p) {
	        if (conditionA.accesPossible(p)) {
	            nbPersonnes++;
	            recette += cout;
	        } else {
	            System.out.println("Accès refusé pour : " + p.getNom());
	        }
	    }
	 
	 
	 public float getRecette() {
	        return recette;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void affiche() {
	        System.out.println("Attraction : " +nom +" | Coût : " +cout+ " | Nb personnes : " +nbPersonnes+" | Recette : "+recette );
	    }
}

	

    
