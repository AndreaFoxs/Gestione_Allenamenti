package Gestione.Allenamenti;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaginaCliente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServicesCrud crud = new ServicesCrud("jpa-example");
		Cliente cliente = new Cliente();
		String nomeCliente = (String) req.getParameter("nome");
		String cognomeCliente = (String) req.getParameter("cognome");
		String codiceFiscale = (String) req.getParameter("codFiscale");
		cliente.setNome(nomeCliente);
		cliente.setCognome(cognomeCliente);
		cliente.setCodiceFiscale(codiceFiscale);
		if (VerificaCliente.verificaCodFiscale(cliente)) {
			System.out.println("codice fiscale OK");
			crud.jpaCreate(cliente);
		}else{
			System.out.println("codice fiscale NO");

		}
	
	}
	
	
}
