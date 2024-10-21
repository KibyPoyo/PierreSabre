package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		parler("J�ai piqu� les " + argentExtorque + " sous de " + victime.getNom() +
				", ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
	}
}
