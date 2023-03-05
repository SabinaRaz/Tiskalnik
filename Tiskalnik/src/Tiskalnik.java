/*	
	Ime datoteke:  Tiskalnik.java
	Avtor:         Sabina Raztresen		
*/

//Deklariramo javni razred Tiskalnik
//implementira vmesnik AliTiska
public class Tiskalnik implements AliTiska {
	
	//Deklariramo zasebne lastnosti razreda Tiskalnik
    private String znamkaTiskalnika;
	private boolean jeBarvni;
	private String mrezniTiskalnik;
	private int kolikoStrani;
	private boolean trenutnoTiska;
	
	//Javni konstruktor
	//Vhodni parametri: /
	//Potek/opis: ustvari nov objekt tipa Tiskalnik
	//Vrne vrednost: true - nov objekt
	public Tiskalnik() {
		
		//Inicializiramo lastnosti objekta
		znamkaTiskalnika = "";
		jeBarvni = false;
		mrezniTiskalnik = "";
		kolikoStrani = 0;
		trenutnoTiska = false;
		
		System.out.println("Ustvarjam nov objekt tipa Tiskalnik.");
	}
	
	//Javni konstruktor
	//Vhodni parametri: koliko strani lahko natisne
	//Potek/opis: ustvari nov objekt tipa Tiskalnik
	//Vrne vrednost: true - nov objekt
	public Tiskalnik(int k) {
		
		//Inicializiramo lastnosti objekta
		znamkaTiskalnika = "";
		jeBarvni = false;
		mrezniTiskalnik = "";
		kolikoStrani = k;
		trenutnoTiska = false;
		
		System.out.println("Ustvarjam nov objekt tipa Tiskalnik z možnostjo tiskanja " + k + " strani.");
	}
	
	//Javni konstruktor
	//Vhodni parametri: znamka tiskalnika, koliko strani lahko natisne
	//Potek/opis: ustvari nov objekt tipa Tiskalnik
	//Vrne vrednost: true - nov objekt
	public Tiskalnik(String znamka, int k) {
		
		//Inicializiramo lastnosti objekta
		znamkaTiskalnika = znamka;
		jeBarvni = false;
		mrezniTiskalnik = "";
		kolikoStrani = k;
		trenutnoTiska = false;
		
		System.out.println("Ustvarjam nov objekt tipa Tiskalnik znamke " + znamka + " z možnostjo tiskanja " + k + " strani.");
	}
	
	//Javni konstruktor
	//Vhodni parametri: znamka tiskalnika, koliko strani lahko natisne, ali je mrežni tiskalnik
	//Potek/opis: ustvari nov objekt tipa Tiskalnik
	//Vrne vrednost: true - nov objekt
	public Tiskalnik(String znamka, int k, String mrezni) {
		
		//Inicializiramo lastnosti objekta
		znamkaTiskalnika = znamka;
		jeBarvni = false;
		mrezniTiskalnik = mrezni;
		kolikoStrani = k;
		trenutnoTiska = false;
		
		System.out.println("Ustvarjam nov objekt tipa Tiskalnik znamke " + znamka + " z možnostjo tiskanja " + k + " strani. Gre za mrežni tiskalnik z IP naslovom " + mrezni + ".");
	}
	
	//Javna metoda za tiskanje - javi izjemo za neuspešno tiskanje
	//Vhodni parametri: k - koliko strani bo natisnjenih
	//Potek/opis: nastavi število strani, ki bodo natisnjene... ustrezno se zmanjša število preostalih strani za tiskanje
	//Vrne vrednost: true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
	public boolean tiskaj(int k) throws Exception {
		
		if(k > 0) {
			System.out.println("\nTiskam " + k + " strani.");
			
			//Izračunaj stanje kartuše
			kolikoStrani = kolikoStrani - k;
			
			System.out.println("S kartušo v tiskalniku lahko natisnemo še " + kolikoStrani + " strani.");
			
			return true;
		}
		else {
			//Javi izjemo za neuspešno tiskanje
			throw new Exception("Tiskanje ni bilo uspešno!");	
		}
	}
	
	//Javna metoda za vstavitev nove barvne kartuše
	//Vhodni parametri: k - koliko strani nova kartuša natisne
	//Potek/opis: nastavi število strani in preveri, če kartuša ustreza tiskalniku
	//Vrne vrednost: true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
	public boolean barvnakartusa(int k) {
		
		System.out.println("\nPoteka zamenjava kartuše.");
		System.out.println("Koliko strani še lahko natisnemo s staro kartušo: " + kolikoStrani);
		
		//Če je tiskalnik barvni
		if(jeBarvni) {
			
			//Nastavimo novo število strani
			kolikoStrani = k;
			
			System.out.println("Koliko strani lahko natisnemo z novo kartušo: " + kolikoStrani);
			
			// Vrnemo uspešno zamenjavo
			return true;
		}
		else { 
			
			System.out.println("Kartuša ne ustreza barvnemu tiskalniku.");
			
			// Vrnemo neuspešno zamenjavo
			return false;
			
		}
	
	}
	
	//Javna metoda za vstavitev nove črnobele kartuše
	//Vhodni parametri: k - koliko strani nova kartuša natisne
	//Potek/opis: nastavi število strani in preveri, če kartuša ustreza tiskalniku
	//Vrne vrednost: true - vstavitev kartuše je uspešna, false - vstavitev kartuše ni uspešna
	public boolean cbkartusa(int k) {
		
		System.out.println("\nPoteka zamenjava kartuše.");
		System.out.println("Koliko strani še lahko natisnemo s staro kartušo: " + kolikoStrani);
		
		//Če je tiskalnik črnobel
		if(!jeBarvni) {
			
			//Nastavimo novo število strani
			kolikoStrani = k;
			
			System.out.println("Koliko strani lahko natisnemo z novo kartušo: " + kolikoStrani);
			
			// Vrnemo uspešno zamenjavo
			return true;
		}
		else { 
			
			System.out.println("Kartuša ne ustreza črnobelemu tiskalniku.");
			
			// Vrnemo neuspešno zamenjavo
			return false;
			
		}
	
	}
	
	//Javna getter metoda, ki vrne znamko, število preostalih strani in mrežni naslov
	//Vhodni parametri: /
	//Potek/opis: vrne vrednosti
	//Vrne vrednost: niz z znamko, številom preostalih strani in mrežni naslov
	public String getTiskalnik() {
		return "znamka: " + znamkaTiskalnika + "; število strani: " + kolikoStrani + "; mrežni naslov: " + mrezniTiskalnik;
	}
	
	//Implementiramo metodo, ki vrne podatek ali tiskalnik tiska
	//in jo predpisuje vmesnik AliTiska
	//Vhodni parametri: /
	//Potek/opis: Vrne ali tiska
	//Vrne vrednost: boolean - ali tiska
	public boolean getAliTiska(){
		return trenutnoTiska;
	}
	
}
