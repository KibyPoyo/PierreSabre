package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
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
//		Commercant marco = new Commercant("Marco",1000000);
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
//		// SCENARIO 3
//		Yakuza yakuLeNoir = new Yakuza("Yaku le Noir","whisky",0,"Clan des pas gentils");
//		Commercant marco = new Commercant("Marco",15);
//		
//		yakuLeNoir.direBonjour();
//		yakuLeNoir.extorquer(marco);
		
//		// SCENARIO 4
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco",0);
		
		roro.direBonjour();
		roro.donner(marco);
	}
}
