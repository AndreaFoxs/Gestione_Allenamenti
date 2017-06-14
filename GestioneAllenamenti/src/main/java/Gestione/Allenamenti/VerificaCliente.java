package Gestione.Allenamenti;

import java.util.regex.Pattern;

public class VerificaCliente {

	public static boolean verificaCodFiscale(Cliente cliente) {
		boolean verifica = false;
		String codFiscale = cliente.getCodiceFiscale().toUpperCase();
		String regexCF = "[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]";
		if (cliente.getNome()==null) {
			verifica = false;			
		}
		if (cliente.getCognome() == null) {
			verifica = false;			
		}
	    if (Pattern.matches(regexCF, codFiscale)) {
	    	verifica = true;			
	    } else {
	      verifica = false;
	    }
	    return verifica;
	  }
	
}
