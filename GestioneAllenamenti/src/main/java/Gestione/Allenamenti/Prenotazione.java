package Gestione.Allenamenti;

public class Prenotazione {

	private String data;
	private int ora;
	
	
	public Prenotazione() {
		super();
	}
	public Prenotazione(String data, int ora) {
		super();
		this.data = data;
		this.ora = ora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	
	
	
}
