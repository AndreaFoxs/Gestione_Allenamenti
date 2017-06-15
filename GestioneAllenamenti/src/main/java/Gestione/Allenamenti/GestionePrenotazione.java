package Gestione.Allenamenti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionePrenotazione {

 public	List<String> allenamenti() {
	
	 	ServicesCrud crud = new ServicesCrud("jpa-example");
		List<String> listaTrainer = new ArrayList<String>();
		listaTrainer = crud.jpaRead("select distinct (p.settoreAllenamento)  from PersonalTrainer p").getResultList();
	 
	 return listaTrainer ;
		
	}

public List<String> trainerPerAllenamento(String tipoAllenamento){
	ServicesCrud crud = new ServicesCrud("jpa-example");
	String allenamento = tipoAllenamento;
	List<PersonalTrainer> listaTrainer = new ArrayList<>();
	listaTrainer = crud.jpaRead("select p from PersonalTrainer p ").getResultList();
	List<String> nomiTrainer = new ArrayList<>();
	for (PersonalTrainer personalTrainer : listaTrainer) {
		if (personalTrainer.getSettoreAllenamento().equals(allenamento)) {
			
			nomiTrainer.add(personalTrainer.getNome());
		}
	}
	
	return nomiTrainer;
}

}
