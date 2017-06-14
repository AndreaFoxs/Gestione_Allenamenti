package Gestione.Allenamenti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Cliente", schema = "gestioneallenamenti")
public class Cliente {
	
	@Id
	@GeneratedValue
	private Integer idCliente;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String codiceFiscale;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCliente")
	List<Prenotazione> listaPrenotazioni = new ArrayList<Prenotazione>();

	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

//	String regex = "[A-Z]{6}(0-9){2}[A-Z]{1}[1-9]{2}[A-Z]{1}[1-9]{3}[A-Z]{1}";

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale1) {
		this.codiceFiscale = codiceFiscale1;
	}

	// Pattern pattern = Pattern.compile(regex);
	// Matcher matcher = pattern.matcher(codiceFiscale);
	//
	//
	//
	// System.out.println("Inserisci codice fiscale");
}
