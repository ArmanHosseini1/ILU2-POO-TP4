package produit;
import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",Unité.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	public String getDescription() {
		return getNom() + " de " + poids + unité + " chassé par " + chasseur.getNom();
	}
}
