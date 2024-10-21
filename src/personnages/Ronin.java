package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int montantDonnation = getArgent() / 10;
		perdreArgent(montantDonnation);
		beneficiaire.gagnerArgent(montantDonnation);
				
		parler(beneficiaire.getNom() + ", prend ces " + montantDonnation + " sous.");
		beneficiaire.parler(montantDonnation + " sous ! Je te remercie genereux donnateur !");
	}
	
}
