package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

	private int antall;
	private LinearNode<Film> start;

	
	public Filmarkiv2() {
		antall = 0;
	}
	private Film[] utvid(Film[] liste, int n) {
		Film[] nyliste = new Film [n];
		for(int i = 0; i < n; i++) {
			nyliste[i] = liste[i];
		}
		return nyliste;
		
	}
	
	@Override
    public Film finnFilm(int nr) {
        LinearNode<Film> node = start;

        while (node != null) {
            if (node.getElement().getNr() == nr) 
            	return node.getElement();
        }

        return null;
    }
	
	@Override
    public void leggTilFilm(Film nyFilm) {
        LinearNode<Film> node = start;

        while (node != null) {
            node = node.getNeste();
        }

        node.setNeste(new LinearNode<Film>(nyFilm));
        antall++;
    }

	    @Override
	    public Film[] soekProdusent(String delstreng) {
	        Film[] resultat = new Film[this.antall];
	        int antallFilmResultat = 0;

	        LinearNode<Film> node = start;
	        
	        while (node != null) {
	            if (node.getElement().getProdusent().contains(delstreng)) {
	                resultat[this.antall] = node.getElement();
	                antallFilmResultat++;
	            }
	        }

	        return resultat;
	    }

	    @Override
	    public int antall(Sjanger sjanger) {
	        int antallSjanger = 0;

	        LinearNode<Film> node = start;

	        while (node != null) {
	            if (node.getElement().getSjanger() == sjanger) {
	                antallSjanger++;
	            }
	            node = node.getNeste();
	        }

	        return antallSjanger;
	    }

	    @Override
	    public int antall() {
	        return this.antall;
	    }
}
