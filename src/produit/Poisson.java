package produit;

public class Poisson extends Produit {
	String date;
	public Poisson(String date) {
		super("poisson", Unité.KILOGRAMME);
		this.date = date;
	}
	public String getDescription() {
		return getNom() + " pêchés " + date;
	}
}
