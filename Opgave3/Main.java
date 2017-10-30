package Opgave3;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Student Johan = new Student("Kvare", "Johan", 1998, 'm', 324232, "Data100");
		Student Pauline = new Student("Jensen", "Pauline", 1989, 'k', 324123, "ING100");
		Lærer Karl = new Lærer("Ørnen", "Karl", 1968, 'm', 20000, 909892930);
		Lærer Nina = new Lærer("Karlsen", "Nina", 1975, 'k', 23000, 909835287);
		Lærer Karsten = new Lærer("Nielsen", "Karsten", 1980, 'm', 21000, 902335487);

		Personsamling hvl = new Personsamling(1);

		hvl.leggTil(Johan);
		hvl.leggTil(Pauline);
		hvl.leggTil(Karl);
		hvl.leggTil(Nina);
		hvl.leggTil(Karsten);

		System.out.println(hvl.eldst().toString());
		System.out.println();

		hvl.statistikk();

		System.out.println();
		System.out.println(Johan.tilHTML());

		Johan.tilHTMLFil();
		Pauline.tilHTMLFil();
		Karl.tilHTMLFil();
		Nina.tilHTMLFil();
		Karsten.tilHTMLFil();

		hvl.printIndex();

	}

}
