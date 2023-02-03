package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.adt.FilmarkivADT;
import java.util.Scanner;
import java.lang.Integer;

public class Tekstgrensesnitt {

	// lese opplysningene om en FILM fra tastatur
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
    
    System.out.println("Filmselskap:");
    film.setFilmSelskap(obj.nextLine());
    
    System.out.println("Filmnummer:");
    film.setFilmNr(Integer.parseInt(obj.nextLine()));
		
	return null;
	}
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
	// TODO
	}
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,
	 String delstreng) {
	// TODO
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
