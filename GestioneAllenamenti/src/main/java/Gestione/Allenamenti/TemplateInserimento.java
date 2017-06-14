package Gestione.Allenamenti;



public class TemplateInserimento {

	ServicesCrud crud = new ServicesCrud("jpa-example");
	Cliente nuovoCliente = new Cliente();
	nuovoCliente.setNome(nome);
	
	crud.jpaCreate(Cliente);
	
}
