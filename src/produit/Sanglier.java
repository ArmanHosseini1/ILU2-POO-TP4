package produit;
import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",Unit�.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	public String getDescription() {
		return getNom() + " de " + poids + unit� + " chass� par " + chasseur.getNom();
	}
}
