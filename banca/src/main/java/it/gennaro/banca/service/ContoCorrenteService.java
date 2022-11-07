package it.gennaro.banca.service;

import java.util.List;



import it.gennaro.banca.model.ContoCorrente;
import it.gennaro.banca.model.UtenteBancario;



public interface ContoCorrenteService {

	
	List<ContoCorrente> getAllConti();
	void salvaConto(ContoCorrente conti);
	ContoCorrente getContiById(long id);
	List<ContoCorrente> findAllContiByUtentebancario(UtenteBancario utente);
	


	
}
