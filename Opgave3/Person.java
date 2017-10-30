package Opgave3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Person {

	private String etternavn;
	private String fornavn;
	private int fødselsår;
	private char kjønn;

	public Person() {
		etternavn = "";
		fornavn = "";
		fødselsår = 1991;
		kjønn = 'm';
	}

	public Person(String etternavn, String fornavn, int fødselsår, char kjønn) {

		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.fødselsår = fødselsår;
		this.kjønn = kjønn;
	}

	@Override
	public String toString() {
		return "Person [etternavn = " + etternavn + ", fornavn = " + fornavn + ", fødselsår = " + fødselsår
				+ ", kjønn = " + kjønn + "]";
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

	public String tilHTML() {
		String kjønn = "";
		if (getKjønn() == 'm') {
			kjønn = "MANN";
		} else {
			kjønn = "KVINNE";
		}
		return "<html>" + "\n" + "<ul>" + "\n" + "<li>" + getFornavn() + " " + getEtternavn() + "</li>" + "\n" + "<li>"
				+ getFødselsår() + " " + kjønn + "</li>" + "\n" + "</ul>" + "\n" + "</html>";
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
