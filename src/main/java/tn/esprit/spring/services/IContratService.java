package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;


public interface IContratService {
	
	
	public List<Contrat> getAllContrats();
	public Contrat getContratById(int id);

	public Contrat deleteContratById(int contratId);
	
	public Contrat updateContratById(int contratId,Contrat contrat);

	public int ajouterContrat(Contrat contrat);
}
