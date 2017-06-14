package Gestione.Allenamenti;

public class PersonalTrainer {
	String nome ;
	String settoreAllenamento;
	
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
