package tn.esprit.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IContratService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.ITimesheetService;

import java.util.List;
public class RestControllerContrat {
	@Autowired
	IContratService contratService;
	
	@PostMapping("/ajouterContrat")
	@ResponseBody
	public int ajouterMission(@RequestBody Contrat contrat) {
	return	contratService.ajouterContrat(contrat);
		 
	}
	
	@PutMapping("/updateContrat/{idContrat}")
	@ResponseBody
	public void ajouterMission(@RequestBody Contrat contrat,@PathVariable("idContrat")int idContrat) {
		  contratService.updateContratById( idContrat,contrat);
		
	}
	
	@GetMapping(value = "getContrat/{idContrat}")
    @ResponseBody
	public Contrat getEntrepriseById(@PathVariable("idContrat") int idContrat) {

		return contratService.getContratById(idContrat);
	}
	
	@GetMapping(value = "/Contrats")
    @ResponseBody
	public List<Contrat> getAllContrats() {

	return	contratService.getAllContrats();
	}
	
	
	@DeleteMapping("/deleteContrat/{idContrat}") 
	@ResponseBody 
	public void deleteDepartementById(@PathVariable("idContrat") int idContrat) {
		contratService.deleteContratById(idContrat);

	}
}
