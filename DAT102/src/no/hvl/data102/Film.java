package no.hvl.data102;

import no.hvl.data102.Sjanger;

public class Film {
// 1.1 - Data
	int filmNr;
	String filmSkaper;
	String tittel;
	int lanseringsår;
	Sjanger sjanger; 
	String filmSelskap;

// Konstruktører
	public Film() {
	}
	
	public Film(int filmNr, String filmSkaper, String tittel,
			int lanseringsår, String filmSelskap) {
		this.filmNr = filmNr;  this.tittel = tittel;
		this.filmSkaper = filmSkaper;  this.lanseringsår = lanseringsår;
		this.filmSelskap = filmSelskap;
	}
	  
// Metoder
	// get og set metoder
	public void setFilmNr(int filmNr) {
		this.filmNr = filmNr;
	}
	public void setFilmSkaper(String filmSkaper) {
		this.filmSkaper = filmSkaper;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	public void setLanseringsår(int lanseringsår) {
		this.lanseringsår = lanseringsår;
	}
	public void setFilmSelskap(String filmSelskap) {
		this.filmSelskap = filmSelskap;
	}
	public int getFilmNr() {
		return filmNr;
	}
	public String getFilmSkaper() {
		return filmSkaper;
	}
	public String getTittel() {
		return tittel;
	}
	public int getLanseringsår() {
		return lanseringsår;
	}
	public String getFilmSelkap() {
		return filmSelskap;
	}
	// equals metode
	@Override
	public boolean equals(Object obj) {
		Film s = (Film) obj;
		
		if (getFilmNr() != s.getFilmNr()) {
			return false;
		}
		else {
			return true;
		}
	}
	// hashcode metode
	/* Oppgaven sier at om nr er det samme som medlemsvariabelen 
	 * kan vi skrive hashcode slik som under, men hva er
	 * medlemsvariablene? den er ikke nevnt noen steder tidligere!!
	 */
	@Override 
	public int hashCode() { 
	    Integer temp = filmNr; 
	    return temp.hashCode(); 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
