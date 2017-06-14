package Gestione.Allenamenti;

import java.util.regex.Pattern;

public class VerificaCliente {

	public boolean verificaCodFiscale(Cliente cliente) {
		
	   cliente.getNome();
	   
		
		
		String regexCF = "[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]";
	    boolean verifica = false;
	    
		if (Pattern.matches(regexCF, regexCF)) {
	      verifica = true;
	    } else {
	      verifica = false;
	    }
	    return verifica;
	  }
	
}
