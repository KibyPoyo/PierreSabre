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
	
	public void provoquer(Yakuza adversaire) {
		if (honneur >= adversaire.getReputation()) {
			parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
			parler("Je t'ai eu petit Yakuza !");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			adversaire.gagner(perte);
			perdreArgent(perte);
			honneur--;
		}
	}
	
	
}
