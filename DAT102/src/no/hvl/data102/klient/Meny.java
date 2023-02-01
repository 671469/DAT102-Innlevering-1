package no.hvl.data102.klient;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	public Meny(FilmarkivADT filmarkiv){
	tekstgr = new Tekstgrensesnitt();
	this.filmarkiv = filmarkiv;
	}
	public void start(){
	 // legg inn en del forhåndsdefinerte filmer for å teste metodene
	// TODO
	}

}
