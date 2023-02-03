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

	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,
			String delstreng) {
		Film[] delstrengITittel = filma.soekTittel(delstreng);
		
		for (Film film : delstrengITittel) {
			this.visFilm(film);
		}
	}

	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		Film[] avFilmSkaper = filma.soekProdusent(delstreng);
		
		for (Film film : avFilmSkaper) {
			this.visFilm(film);
	}
}

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		// TODO
	}
}
