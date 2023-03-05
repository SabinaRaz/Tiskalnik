/*	
	Ime datoteke:	Miza.java
	Avtor:			Sabina Raztresen
	Vhodni podatki:	/
	Opis:			Aplikacija z grafičnim uporabniškim vmesnikom za delo s tiskalniki
	Izhodni podatki:Okno grafičnega uporabniškega vmesnika				
*/

//Uvozimo pakete za delo z GUI
import javax.swing.*;

//Uvozimo paket za delo z dogodki
import java.awt.event.*;

//Deklariramo javni razred
public class Miza extends JFrame implements ActionListener {
	
	//Deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField znamkaPolje, mrezninaslovPolje;
	private JTable tabela;
	private TiskalnikTableModel modelTabele;
	
	//Deklariramo javno statično metodo, ki se izvede ob zagonu programa
	//Vhodni parametri: Vhodni parametri iz konzole
	//Potek/opis: Ustvari novo okno
	//Vrne vrednost: /
	public static void main(String[] args) {

		Miza m = new Miza("Pisalna miza s tiskalniki");
	}
	
	//Javni konstruktor
	//Vhodni parametri: n - naslov okna
	//Potek/opis: Vrne objekt tipa Miza
	//Vrne vrednost: Vrne objekt tipa Miza
	public Miza(String n) {
		
		//Kličemo konstruktor nadrazreda
		super(n);
		
		//Inicializiramo lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj tiskalnik");
		znamkaPolje = new JTextField(16);
		mrezninaslovPolje = new JTextField(16);
		modelTabele = new TiskalnikTableModel();
		tabela = new JTable(modelTabele);
		
		//Površino dodamo na mizo
		add(povrsina);
		
		//Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);
		
		//Dodamo gumb in vnosna polja in tabelo na površino
		povrsina.add(new JLabel("Znamka: "));
		povrsina.add(znamkaPolje);
		povrsina.add(new JLabel("IP naslov: "));
		povrsina.add(mrezninaslovPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		//Pokažemo okno
		setVisible(true);
		
		//Nastavimo velikost
		setSize(1200, 600);
		
		//Nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam nov objekt Miza.");
	}
	
	//Metoda, ki jo predpisuje vmesnik ActionListener
	//Vhodni parametri: ae - dogodek
	//Potek/opis: doda tiskalnik v tabelo
	//Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("Dodajam tiskalnik...");
		System.out.println("Znamka je " + znamkaPolje.getText());
		System.out.println("Mrežni naslov tiskalnika je " + mrezninaslovPolje.getText());
		
		//Dodamo objekt v seznam
		modelTabele.addTiskalnik(new Tiskalnik(znamkaPolje.getText(), 2000, mrezninaslovPolje.getText()));
		
		}
	
}
