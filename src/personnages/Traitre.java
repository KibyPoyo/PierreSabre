package personnages;

import java.lang.reflect.Member;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	Random random = new Random();
	
	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("J'ai de la traitrise MOUHAHAHAHA : " + niveauTraitrise);
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentRanconner = commercant.getArgent() * 2 / 10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " +
					argentRanconner + "sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus ranconner personne sinon un Samourai risque de me demasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux pas faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			int index = random.nextInt();
			Humain ami = memoire[index];
			int don = getArgent() / 20;
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			String nom = getNom();
			parler("Merci " + nom + ". Vous etes quelqu'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise--;
			}
		}
	}
}
