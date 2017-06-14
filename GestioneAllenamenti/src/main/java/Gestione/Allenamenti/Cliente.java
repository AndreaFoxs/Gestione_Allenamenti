package Gestione.Allenamenti;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {

	private String nome;
	private String cognome;
	private String codiceFiscale1;

	

	public Cliente() {
		super();
	}

	public Cliente(String nome, String cognome, String codiceFiscale1, String regex, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale1 = codiceFiscale1;
		this.regex = regex;
		this.codiceFiscale = codiceFiscale;
	}

	String regex = "[A-Z]{6}(0-9){2}[A-Z]{1}[1-9]{2}[A-Z]{1}[1-9]{3}[A-Z]{1}";
	String codiceFiscale = input.nextLine();
	
	
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

	public String getCodiceFiscale1() {
		return codiceFiscale1;
	}

	public void setCodiceFiscale1(String codiceFiscale1) {
		this.codiceFiscale1 = codiceFiscale1;
	}

	// Pattern pattern = Pattern.compile(regex);
	// Matcher matcher = pattern.matcher(codiceFiscale);
	//
	//
	//
	// System.out.println("Inserisci codice fiscale");
}
