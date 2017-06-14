package Gestione.Allenamenti;

public class TemplateInserimento {

	public static void main(String[] args) {

		/*
		 * Connection conn = null; Statement stmt = null;
		 * 
		 * try {
		 * 
		 * Class.forName("com.mysql.jdbc.Driver"); Connection connection =
		 * DriverManager.getConnection(
		 * "jdbc:mysql://localhost/world?useSSL=false", "root", "root");
		 */

		ServicesCrud crud = new ServicesCrud("jpa-example");

		PersonalTrainer newPersonalTrainer = new PersonalTrainer();
		newPersonalTrainer.setNome(" luigia ");
		newPersonalTrainer.setSettoreAllenamento(" calcio ");
		crud.jpaCreate(newPersonalTrainer);
		
		PersonalTrainer newPersonalTrainer2 = new PersonalTrainer();
		newPersonalTrainer2.setNome(" micias ");
		newPersonalTrainer2.setSettoreAllenamento(" pallavolo ");
		crud.jpaCreate(newPersonalTrainer2);
		
		PersonalTrainer newPersonalTrainer3 = new PersonalTrainer();
		newPersonalTrainer3.setNome(" caldas");
		newPersonalTrainer3.setSettoreAllenamento(" pallavolo ");
		crud.jpaCreate(newPersonalTrainer3);
		
		PersonalTrainer newPersonalTrainer4 = new PersonalTrainer();
		newPersonalTrainer4.setNome(" ugo");
		newPersonalTrainer4.setSettoreAllenamento(" calcio ");
		crud.jpaCreate(newPersonalTrainer4);
		
		PersonalTrainer newPersonalTrainer5 = new PersonalTrainer();
		newPersonalTrainer5.setNome(" Lucaz");
		newPersonalTrainer5.setSettoreAllenamento(" calcio ");
		crud.jpaCreate(newPersonalTrainer5);
		

	}
}
