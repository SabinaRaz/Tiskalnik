/*	
	Ime datoteke:	TiskalnikTableModel.java
	Avtor:			Sabina Raztresen	
*/

//Uvozimo paket za delo s tabelami
import javax.swing.table.*;

//Deklariramo javni razred
public class TiskalnikTableModel extends DefaultTableModel {
		
		//Konstruktor
		public TiskalnikTableModel() {
		
		//Kliče konstruktor nadrazreda
		super();
		
		//V tabelo dodamo stolpce
		addColumn("Znamka tiskalnika");
		addColumn("Ali tiskalnik tiska");
		
		//Dodamo naslovno vrstico
		//Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Znamka tiskalnika", "Ali tiskalnik tiska"};
		//Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}	
	
	//Vhodni parametri: ts - Tiskalnik
	//Potek/opis: Metoda, ki doda tiskalnik na seznam in v tabelo
	//Vrne vrednost: /
	public void addTiskalnik(Tiskalnik ts) {
		
		//Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {ts.getTiskalnik(), ts.getAliTiska()};
		
		//Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
}