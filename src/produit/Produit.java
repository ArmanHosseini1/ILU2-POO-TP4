package produit;

public abstract class Produit implements IProduit {
	private String nom;
	public Unit� unit�;
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public abstract String getDescription();
	public Produit(String nom, Unit� unit�) {
		this.nom = nom;
		this.unit� = unit�;
	}
}
