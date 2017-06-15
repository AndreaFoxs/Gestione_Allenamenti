package Gestione.Allenamenti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Prenotazione", schema = "gestioneallenamenti")
public class Prenotazione {
	@Id
	@GeneratedValue
	private Integer idPrenotazione;
	@Column
	private String data;
	@Column
	private int ora;
	@Column
	private String trainer;
	
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente idCliente;
	
	public Prenotazione() {
		super();
	}
	public Prenotazione(String data, int ora ,String trainer) {
		super();
		this.data = data;
		this.ora = ora;
		this.trainer=trainer;
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
