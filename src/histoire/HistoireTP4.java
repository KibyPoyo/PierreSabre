package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		
//		// SCENARIO 1
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("boisson", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		
//		// SCENARIO 2
		Commercant marco = new Commercant("Marco",1000000);
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}
