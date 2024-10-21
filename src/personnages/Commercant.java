package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
		
	}
	
	
//	Solution 1 : passer l'attribut argent en public ou protected --> ne respecte pas les bonnes méthodes
//	Solution 2 : utiliser la methode getArgent(), passer en protected parler et perdreArgent/gagnerArgent
	public int seFaireExtorquer() {
		int argentActuel = getArgent();
		perdreArgent(argentActuel);
		parler("J'ai tout perdu ! Le monde est vraiment trop injuste... >:(");
		return argentActuel;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie genereux donateur !");
		gagnerArgent(argent);
	}
	
	
}
