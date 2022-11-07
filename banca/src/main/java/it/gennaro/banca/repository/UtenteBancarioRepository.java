package it.gennaro.banca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import it.gennaro.banca.model.UtenteBancario;
@Repository

public interface UtenteBancarioRepository extends JpaRepository<UtenteBancario,Long>{

	
	
	
	
	
}
