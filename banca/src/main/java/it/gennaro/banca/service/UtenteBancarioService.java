package it.gennaro.banca.service;

import java.util.List;

import it.gennaro.banca.model.UtenteBancario;



public interface UtenteBancarioService {
	List<UtenteBancario> getAllUtenti();
	void salvaUtente(UtenteBancario utente);
	UtenteBancario getUtenteById(long id);
	void cancellaUtenteById(long id);
	
}
