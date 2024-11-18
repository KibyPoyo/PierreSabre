package personnages;

public class Humain {
	private static final int MEMOIRE_MAX = 30;
	
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain[] memoire = new Humain[MEMOIRE_MAX];
	protected int nbConnaissance = 0;
		
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			perdreArgent(prix);
			parler("J'ai " + argent + " sous en poche."
					+ " Je vais pouvoir m'offrir un " + bien + " a " + prix + " sous.");
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche."
					+ " Je ne peux même pas m'offrir un " + bien + " a " + prix + " sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < MEMOIRE_MAX) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder();
		for (int i = 0; i < nbConnaissance; i++) {
			texte.append(memoire[i].getNom() + ", ");
		}
		if (texte.length() > 2) texte.deleteCharAt(texte.length()-2); // Supprime la dernière virgule
		parler("Je connais beaucoup de monde dont : " + texte);
	}
}
