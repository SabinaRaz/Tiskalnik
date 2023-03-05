/*	
	Ime datoteke:	Fax.java
	Avtor:			Sabina Raztresen		
*/

//Deklariramo javni razred, ki razširja razred Tiskalnik
public class Fax extends Tiskalnik {
	
	//Vse lastnosti od nadrazreda se prenesejo
	//Deklariramo nove lastnosti
	private boolean jeFax;
	
	//Javni konstruktor
	//Vhodni parametri: z - znamka multifunkcijske naprave, k - koliko strani lahko natisne
	//Potek/opis:  ustvari nov objekt tipa Fax
	//Vrne vrednost: nov objekt
	public Fax(String z, int k) {
		
		//Pokličemo konstruktor nadrazreda - ustvarimo multifunkcijsko napravo (tiskalnik)
		super(z, k);
		
		System.out.println(z + " je multifunkcijska naprava z možnostjo pošiljanja faxov.");
		
		//Inicializiramo nove lastnosti
		jeFax = true;
		
		//Skušamo testirati tiskanje in zamenjamo kartušo - kličemo metodo, deklariramo v nadrazredu
		try {
			tiskaj(350);
			cbkartusa(k);
		}
		catch(Exception e) {
			System.out.println("Napaka pri tiskanju in zamenjavi kartuše: " + e);
		}
		
	}
	
	//Javna metoda, ki ohladi pivo za želeno temperaturo [st.C]
	//Vhodni parametri: t - temperatura
	//Potek/opis:  zniža temperaturo
	//Vrne vrednost: /
	public void posljifax(String t) {
		
		//Pošlji fax na izbrano telefonsko številko
		System.out.println("\nPošiljam fax na telefonsko številko " + t + "...");
		
	}

}
