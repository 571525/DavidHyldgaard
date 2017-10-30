package Opgave3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lærer extends Person {

	private String etternavn;
	private String fornavn;
	private int fødselsår;
	private char kjønn;
	private int månedsløn;
	private int kontonummer;

	public Lærer() {
		super();
		etternavn = "";
		fornavn = "";
		fødselsår = 1991;
		kjønn = 'm';
		månedsløn = 0;
		kontonummer = 0;
	}

	public Lærer(String etternavn, String fornavn, int fødselsår, char kjønn, int månedsløn, int kontonummer) {
		super();
		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.fødselsår = fødselsår;
		this.kjønn = kjønn;
		this.månedsløn = månedsløn;
		this.kontonummer = kontonummer;
	}

	@Override
	public String toString() {
		return "Lærer [etternavn = " + etternavn + ", fornavn = " + fornavn + ", fødselsår = " + fødselsår
				+ ", kjønn = " + kjønn + ", månedsløn = " + månedsløn + ", kontonummer = " + kontonummer + "]";
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public int getFødselsår() {
		return fødselsår;
	}

	public void setFødselsår(int fødselsår) {
		this.fødselsår = fødselsår;
	}

	public char getKjønn() {
		return kjønn;
	}

	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
	}

	public int getMånedsløn() {
		return månedsløn;
	}

	public void setMånedsløn(int månedsløn) {
		this.månedsløn = månedsløn;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public String tilHTML() {
		String kjønn = "";
		if (getKjønn() == 'm') {
			kjønn = "MANN";
		} else {
			kjønn = "KVINNE";
		}
		return "<html>" + "\n" + "<ul>" + "\n" + "<li>" + getFornavn() + " " + getEtternavn() + "</li>" + "\n" + "<li>"
				+ getFødselsår() + " " + kjønn + "</li>" + "\n" + "<li>" + getMånedsløn() + " " + getKontonummer()
				+ "</li>" + "\n" + "</ul>" + "\n" + "</html>";
	}

	public void tilHTMLFil() throws FileNotFoundException {

		try {
			String filnavn = getEtternavn().toLowerCase() + ".html";
			PrintWriter skriver = new PrintWriter(filnavn);
			skriver.println(tilHTML());
			skriver.close();
		} catch (FileNotFoundException e) {
			System.out.println("Filen finnes ikke");
		}

	}
}
