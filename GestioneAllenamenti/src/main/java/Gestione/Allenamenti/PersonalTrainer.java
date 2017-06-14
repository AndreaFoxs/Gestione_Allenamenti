package Gestione.Allenamenti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonalTrainer", schema = "gestioneallenamenti")
public class PersonalTrainer {
	@Id
	@GeneratedValue
	private Integer idPT;
	@Column
	private String nome ;
	@Column
	String settoreAllenamento;
	
	
	
	public PersonalTrainer() {
		super();
	}
	public PersonalTrainer(String nome, String settoreAllenamento) {
		super();
		this.nome = nome;
		this.settoreAllenamento = settoreAllenamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSettoreAllenamento() {
		return settoreAllenamento;
	}
	public void setSettoreAllenamento(String settoreAllenamento) {
		this.settoreAllenamento = settoreAllenamento;
	}
	

}
