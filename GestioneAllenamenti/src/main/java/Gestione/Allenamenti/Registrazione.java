package Gestione.Allenamenti;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registrazione extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String giorno = (String) req.getParameter("giorno");
		String ora = (String) req.getParameter("ora");
		ora.replaceAll(":", "");
		int orario = Integer.parseInt(ora);
		System.out.println("giorno : "+giorno+" ora "+ora);
	}
	
	
	
}
