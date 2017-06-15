package Gestione.Allenamenti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SceltaTrainer extends HttpServlet {

	GestionePrenotazione trainer = new GestionePrenotazione();
	List<String> listaAllenamenti = new ArrayList<>();
	Prenotazione prenotazione = new Prenotazione("0", 0, "0");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listaAllenamenti = trainer.allenamenti();
		req.setAttribute("listaAllenamenti", listaAllenamenti);
		RequestDispatcher disp = req.getRequestDispatcher("/sceltaTrainer.jsp");
		disp.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tipoAllenamento = req.getParameter("Allenamento");
		List<String> listaTrainer = trainer.trainerPerAllenamento(tipoAllenamento);
		req.setAttribute("listaTrainer", listaTrainer);
		RequestDispatcher disp = req.getRequestDispatcher("/sceltaTrainer.jsp");
		disp.forward(req, resp);
//		String giorno  = req.getParameter("giorno");
//		String ora  = req.getParameter("ora");
//		ora.replaceAll(":", "");
//		int orario = Integer.parseInt(ora);
//		RequestDispatcher disp2 = req.getRequestDispatcher("/sceltaTrainer.jsp");
//		disp.forward(req, resp);
	
	}
	
	
 
}
