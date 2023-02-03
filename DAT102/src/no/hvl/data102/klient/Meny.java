package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv){
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}
	
	public void start(){
		Film [] filmer;
	    filmer = new Film[5];


	    filmer[0] = new Film(1, "Christopher Nolan", "Interstellar",
	                                 2014, Sjanger.SCIFI, "Legendary PP");

	    filmer[1] = new Film(2, "Christopher Nolan", "Dunkirk",
	                                 2017, Sjanger.ACTION, "Warner Bros");

	    filmer[2] = new Film(3, "Megan Park", "The Fallout",
	                                 2021, Sjanger.DRAMA, "New Line Cinema");

			for (Film film : filmer) {
	        this.filmarkiv.leggTilFilm(film);
		
	}

}
}
