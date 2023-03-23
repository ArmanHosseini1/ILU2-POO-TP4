package produit;

public class Poisson extends Produit {
	String date;
	public Poisson(String date) {
		super("poisson", Unit�.KILOGRAMME);
		this.date = date;
	}
	public String getDescription() {
		return getNom() + " p�ch�s " + date;
	}
}
