package Gestione.Allenamenti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SceltaTrainer extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServicesCrud crud = new ServicesCrud("jpa-example");
		List<PersonalTrainer> listaTrainer = new ArrayList<PersonalTrainer>();
		listaTrainer = crud.jpaRead("select p from personaltrainer").getResultList();
		req.setAttribute("listaTrainer", listaTrainer);
		RequestDispatcher disp = req.getRequestDispatcher("/sceltaTrainer.jsp");
		disp.forward(req, resp);
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
}

}
