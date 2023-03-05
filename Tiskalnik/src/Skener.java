/*	
	Ime datoteke:	Skener.java
	Avtor:			Sabina Raztresen		
*/

//Deklariramo javni razred, ki razširja razred Tiskalnik
public class Skener extends Tiskalnik {
	
	//Vse lastnosti od nadrazreda se prenesejo
	//Deklariramo nove lastnosti
	private boolean jeSkener;
	
	//Javni konstruktor
	//Vhodni parametri: z - znamka multifunkcijske naprave, k - koliko strani lahko natisne
	//Potek/opis:  ustvari nov objekt tipa Skener
	//Vrne vrednost: nov objekt
	public Skener(String z, int k) {
		
		//Pokličemo konstruktor nadrazreda - ustvarimo multifunkcijsko napravo (tiskalnik)
		super(z, k);
		
		System.out.println(z + " je multifunkcijska naprava z možnostjo skeniranja.");
		
		//Inicializiramo nove lastnosti
		jeSkener = true;
		
		//Skušamo testirati tiskanje in zamenjamo kartušo - kličemo metodo, deklariramo v nadrazredu
		try {
			tiskaj(350);
			cbkartusa(k);
		}
		catch(Exception e) {
			System.out.println("Napaka pri tiskanju in zamenjavi kartuše: " + e);
		}
		
	}
	
	//Javna metoda, ki skenira dokument - javi izjemo za neuspešno skeniranje
	//Vhodni parametri: t - format izhodne datoteke
	//Potek/opis: skenira dokument
	//Vrne vrednost: /
	public void skeniraj(String t) throws Exception {
		
		if(t.equals("PDF")) {
			//Skeniraj v željenem formatu
			System.out.println("\nSkeniram dokument.\nNa računalnik bo prenešen v " + t + " formatu.");
		}
		else {
			//Javi izjemo za neuspešno skeniranje
			throw new Exception("Napačen format datoteke. Skeniranje ni bilo uspešno!");
		}
		
	}

}
