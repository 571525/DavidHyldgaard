package Opgave3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Personsamling {
	
	private Person[] Personsamling;
	private int nesteledige = 0;

	public Personsamling (int antall) {
		Personsamling = new Person[antall];
		nesteledige = 0;
	}
	
	public void leggTil(Person p) {
		try {
		Personsamling[nesteledige] = p;
		nesteledige++;
		}catch (ArrayIndexOutOfBoundsException e) {
			utvid();
			Personsamling[nesteledige] = p;
			nesteledige++;
		}
	}
	
	
	private void utvid() {
		Person[] hjelpetab = new Person[Personsamling.length * 2];
		for (int i = 0; i < Personsamling.length; i++) {
			hjelpetab[i] = Personsamling[i];
		} 		
		Personsamling = hjelpetab;
	}
	
	public void skrivUt() {
		for (int i = 0; i< nesteledige; i++) {
			System.out.println(Personsamling[i].toString());
		}
	}
	
	public Person eldst() {
		
		Person eldst = Personsamling[0];
		
		for (int i = 1; i < nesteledige; i++) {
			if (Personsamling[i].getFødselsår() < eldst.getFødselsår()) {
				eldst = Personsamling[i];
			}
		}
	return eldst;
	}
	
	public void statistikk() {
		int menn =0;
		int kvinner =0;
		
		int lærer = 0;
		int studenter = 0;
		
		for (int i = 0; i < nesteledige; i++) {
			if (Personsamling[i].getKjønn() == 'm') {
				menn++;
			}
			else {
				kvinner++;
			}
		}
		
		for (int i = 0; i < nesteledige; i++) {
			if (Personsamling[i] instanceof Lærer) {
				lærer++;
			}
			else {
				studenter++;
			}
		}
		
		int total = kvinner + menn;
		
		System.out.println("Statistikk" + "\n" + "Menn: " + menn + "\n" + "Kvinner: " + kvinner + "\n" + "Personer totalt: " + total);
		System.out.println();
		System.out.println("Statistikk" + "\n" + "Lærer: " + lærer + "\n" + "Studenter: " + studenter + "\n" + "Personer totalt: " + total);

	}
	
	public void printIndex() {
		try {
			String filnavn = "index.html";
			PrintWriter skriver = new PrintWriter(filnavn);
			
			skriver.println("<html>" + "\n" + "<ul>" + "\n");
			for (int i = 0; i < nesteledige; i++) {
				skriver.println("<li><a href=\"" + Personsamling[i].getEtternavn().toLowerCase() + ".html\">" + Personsamling[i].getFornavn() +" "+ Personsamling[i].getEtternavn() + "</a></li>" +"\n");
			}
			skriver.println("</ul>" + "\n" + "</html>" + "\n");
			skriver.close();
			}catch (FileNotFoundException e){
				System.out.println("Filen finnes ikke");
			}
		
	}
}

