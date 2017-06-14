package Gestione.Allenamenti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TemplateInserimento {

	public static void main(String[] args) {
		

	/*	Connection conn = null;
		Statement stmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false", "root",
					"root");
		*/
	
	ServicesCrud crud = new ServicesCrud("jpa-example");
	
	PersonalTrainer newPersonalTrainer = new PersonalTrainer();
	newPersonalTrainer.setNome(" luigia ");
	newPersonalTrainer.setSettoreAllenamento(" calcio ");
	
	PersonalTrainer newPersonalTrainer2 = new PersonalTrainer();
	newPersonalTrainer.setNome(" micias ");
	newPersonalTrainer.setSettoreAllenamento(" pallavolo ");
	
	PersonalTrainer newPersonalTrainer3 = new PersonalTrainer();
	newPersonalTrainer3.setNome(" caldas");
	newPersonalTrainer3.setSettoreAllenamento(" pallavolo ");
	
	PersonalTrainer newPersonalTrainer4 = new PersonalTrainer();
	newPersonalTrainer4.setNome(" ugo");
	newPersonalTrainer4.setSettoreAllenamento(" calcio ");
	
	PersonalTrainer newPersonalTrainer5 = new PersonalTrainer();
	newPersonalTrainer5.setNome(" Lucaz");
	newPersonalTrainer5.setSettoreAllenamento(" calcio ");
	
	crud.jpaCreate(newPersonalTrainer);
	
}
}
