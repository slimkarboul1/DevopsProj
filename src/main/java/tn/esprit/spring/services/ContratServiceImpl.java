package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {
	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);

	@Autowired
	ContratRepository contratRepository;

	public Contrat getContratById(int id) {
		l.warn("finding Contrat ...");
		return  contratRepository.findById(id).get();
	}
	
	

	public List<Contrat> getAllContrats() {
		l.warn("finding Contrats ...");
		return (List<Contrat>) contratRepository.findAll();
	}
	public int ajouterContrat(Contrat contrat) {
		 l.warn("adding Contrat ...");
		contratRepository.save(contrat);
		l.warn("Contrat added");
		return contrat.getReference();
	}
	
	
	public void updateContratById(int contratId,Contrat contrat) {
		l.warn("finding Contrat ...");
		Contrat foudContrat = contratRepository.findById(contratId).get();
		if(foudContrat!=null)
			l.warn("Contrat not found!");
		else
			l.warn("Contrat updated!");
		foudContrat.setDateDebut(contrat.getDateDebut());
		foudContrat.setSalaire(contrat.getSalaire());
		foudContrat.setTypeContrat(contrat.getTypeContrat());
		contratRepository.save(foudContrat);

	}
	
	
	public void deleteContratById(int contratId) {
		l.warn("deleting Contrat ...");
		Contrat contrat = contratRepository.findById(contratId).get();
		if(contrat!=null)
			l.warn("Contrat not found!");
		else
			l.warn("Contrat deleted!");
		contratRepository.delete(contrat);

	}
}
