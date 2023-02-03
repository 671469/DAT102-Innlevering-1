package no.hvl.data102;

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
			int lanseringsår, Sjanger sjanger, String filmSelskap) {
		this.filmNr = filmNr;  this.tittel = tittel;
		this.filmSkaper = filmSkaper;  this.lanseringsår = lanseringsår;
		this.sjanger = sjanger; this.filmSelskap = filmSelskap;
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
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	public void setFilmSelskap(String filmSelskap) {
		this.filmSelskap = filmSelskap;
	}
	public int getFilmNr() {
		return this.filmNr;
	}
	public String getFilmSkaper() {
		return this.filmSkaper;
	}
	public String getTittel() {
		return this.tittel;
	}
	public int getLanseringsår() {
		return this.lanseringsår;
	}
	public Sjanger getSjanger() {
		return this.sjanger;
	}
	public String getFilmSelskap() {
		return this.filmSelskap;
	}

	// equals metode
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof Film)) return false;

		Film _film = (Film) obj;

		return _film.getFilmNr() == this.getFilmNr();
	}

	// hashcode metode
	@Override 
	public int hashCode() { 
		Integer temp = filmNr; 
		return temp.hashCode(); 
	} 
}
