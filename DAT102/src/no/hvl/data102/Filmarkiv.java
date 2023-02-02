package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	Film[] filmTabell;
	int antall;
	
	public Filmarkiv(int størrelse) {
		filmTabell = new Film[størrelse];
		antall = 0;
	}
	
	private void utvid(){
        Film[] nyListe = new Film[filmTabell.length * 2];
        for(int i = 0; i < filmTabell.length; i++){
            nyListe[i] = filmTabell[i];
        }
        filmTabell = nyListe;
    }
	
	@Override
	public Film finnFilm(int nr) {
		boolean funnet = false;
		int pos = 0;
		
		while (pos < antall && !funnet) {
			if (filmTabell[pos].getFilmNr() == nr) {
				funnet = true;
			} else {
				pos++;
			}
		}
		if (funnet) {
			return filmTabell[pos];
		} else {
			return null;
		}
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == filmTabell.length) {
			utvid();
		}
		filmTabell[antall] = nyFilm;
		antall++;
	}

	@Override
	public boolean slettFilm(int filmnr) {	
		for (int pos = 0; pos < antall; pos++) {
			if (filmTabell[pos].getFilmNr() == filmnr) {
				antall--;
				filmTabell[pos] = filmTabell[antall];
				filmTabell[antall] = null;
				return true;
			}
		}
		return false;
}

			@Override
			public Film[] soekTittel(String delstreng) {
				int antallFilmResultat = 0;
				int i = 0;
				Film[] resultat = new Film[antall];

				while (i < antall) {
					if (filmTabell[i].getTittel().contains(delstreng)) {
						resultat[antallFilmResultat] = filmTabell[i];
						antallFilmResultat++;
					}
					i++;
				}
				return resultat;
			}

	@Override
	public Film[] soekProdusent(String delstreng) {
		int antallFilmResultat = 0;
		int i = 0;
		Film[] resultat =new Film[antall];
		
		while (i < antall) {
			if (filmTabell[i].getFilmSkaper().contains(delstreng)) {
				resultat[antallFilmResultat] = filmTabell[i];
				antallFilmResultat++;
			}
			i++;
		}
		return resultat;
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
