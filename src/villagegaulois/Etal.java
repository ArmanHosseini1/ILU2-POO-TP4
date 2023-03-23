package villagegaulois;
import personnages.*;
import produit.*;

public class Etal<P extends Produit> implements IEtal {
	private Gaulois vendeur;
	P[] prods; //MARCHE GRACE A IProduit!
	int nbProduit;
	int prix;
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.prods = produit;
		this.prix = prix;
	}
}
