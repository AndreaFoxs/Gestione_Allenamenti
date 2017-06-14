package Gestione.Allenamenti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Cliente", schema = "gestioneallenamenti")
public class Prenotazione {
	@Id
	@GeneratedValue
	private Integer idPrenotazione;
	@Column
	private String data;
	@Column
	private int ora;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente idCliente;
	
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
