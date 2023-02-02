package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	Film[] filmTabell;
	int antall;
	
	public Filmarkiv(int størrelse) {
		filmTabell = new Film[størrelse];
		antall = 0;
	}
	
	@Override
	public Film finnFilm(int nr) {
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
	}

	@Override
	public boolean slettFilm(int filmnr) {
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		return 0;
	}

	@Override
	public int antall() {
		return 0;
	}

}
