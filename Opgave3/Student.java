package Opgave3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Student extends Person {

	private String etternavn;
	private String fornavn;
	private int fødselsår;
	private char kjønn;
	private int studentnummer;
	private String klasse;

	public Student() {
		super();
		etternavn = "";
		fornavn = "";
		fødselsår = 1991;
		kjønn = 'm';
		studentnummer = 000000;
		klasse = "";
	}

	public Student(String etternavn, String fornavn, int fødselsår, char kjønn, int studentnummer, String klasse) {
		super();
		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.fødselsår = fødselsår;
		this.kjønn = kjønn;
		this.studentnummer = studentnummer;
		this.klasse = klasse;
	}

	@Override
	public String toString() {
		return "Student [etternavn = " + etternavn + ", fornavn = " + fornavn + ", fødselsår = " + fødselsår
				+ ", kjønn = " + kjønn + ", studentnummer = " + studentnummer + ", klasse = " + klasse + "]";
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

	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public String tilHTML() {
		String kjønn = "";
		if (getKjønn() == 'm') {
			kjønn = "MANN";
		} else {
			kjønn = "KVINNE";
		}
		return "<html>" + "\n" + "<ul>" + "\n" + "<li>" + getFornavn() + " " + getEtternavn() + "</li>" + "\n" + "<li>"
				+ getFødselsår() + " " + kjønn + "</li>" + "\n" + "<li>" + getStudentnummer() + " " + getKlasse()
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
