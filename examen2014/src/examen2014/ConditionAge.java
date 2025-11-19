package examen2014;

public class ConditionAge implements ConditionAcces {
	  private int ageMin;
	  public ConditionAge(int ageMin) {
	        this.ageMin = ageMin;
	    }

	    @Override
	    public boolean accesPossible(Personne p) {
	        return p.getAge() > ageMin;
	    }
}

