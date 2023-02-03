package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;
import java.util.Scanner;
import java.lang.Integer;

public class Tekstgrensesnitt {

	public Film lesFilm(){
		Scanner obj = new Scanner(System.in);
		Film film = new Film();

		System.out.println("Filmnummer:");
		film.setFilmNr(Integer.parseInt(obj.nextLine()));

		System.out.println("Filmskaper:");
		film.setFilmSkaper(obj.nextLine());

		System.out.println("Tittel:");
		film.setTittel(obj.nextLine());

		System.out.println("Lanseringsår:");
		film.setLanseringsår(Integer.parseInt(obj.nextLine()));

		System.out.println("Sjanger: (action, drama, history eller scifi)");
		film.setSjanger(Sjanger.finnSjanger(obj.nextLine()));

		System.out.println("Filmselskap:");
		film.setFilmSelskap(obj.nextLine());

		System.out.println("Filmnummer:");
		film.setFilmNr(Integer.parseInt(obj.nextLine()));

		obj.close();

		return film;
	}

	public void visFilm(Film film) {
		System.out.println("Filmnummer: " + film.getFilmNr());
		System.out.println("Filmskaper: " + film.getFilmSkaper());
		System.out.println("Tittel: " + film.getTittel());
		System.out.println("Lanseringsår" + film.getLanseringsår());
		System.out.println("Sjanger: " + film.getSjanger().toString());
		System.out.println("Filmselskap: " + film.getFilmSelskap());
	}
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,
			String delstreng) {
		
	}
	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		// TODO Denne gjør tilsvarende som metoden over
	}
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		// TODO
	}
	// … Ev. andre metoder

}
