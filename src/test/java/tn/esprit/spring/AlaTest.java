package tn.esprit.spring;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class AlaTest {

	
	
	
	@Autowired
	IEntrepriseService EntrepriseService;
	@Autowired
	IDepartementService idepartmentService;
	
	private static final Logger log = LogManager.getLogger(AlaTest.class);
	@Test
	public void contextLoads() throws Exception {
		List<Entreprise> entr = EntrepriseService.getAllEntreprises();
		for (Entreprise ent : entr) {
			log.warn(ent);
		}
	}
	
	@Test
	public void addEntreprise() throws Exception {
		assertThat(EntrepriseService).isNotNull();
		Entreprise Company = new Entreprise("esprit","esprit");
		assertThat(EntrepriseService.ajouterEntreprise(Company)).isNotEqualTo(-1);
	}
	@Test
	public void addDepartment() throws Exception {
		assertThat(EntrepriseService).isNotNull();
		Departement dep = new Departement("informatique");
		assertThat(EntrepriseService.ajouterDepartement(dep)).isNotEqualTo(-1);
	}
	@Test
	public void affectDepartment() throws Exception {
		Entreprise ent = new Entreprise("esprit", "test affectation");
		int idEnt =EntrepriseService.ajouterEntreprise(ent) ;
	    assertThat(idEnt).isNotEqualTo(-1);
	    
	    
		
		Departement dep = new Departement("informatique test");
		int idDep = this.idepartmentService.addOrUpdateDepartment(dep);
		
		EntrepriseService.affecterDepartementAEntreprise(idDep, idEnt);
	}
	
	@Test
	public void deleteEntrepriseById() throws Exception {
		List<Entreprise> entr = EntrepriseService.getAllEntreprises();
	    EntrepriseService.deleteEntrepriseById(entr.get(0).getId());
	    
	}
	
	@Test
	public void deleteDepartmentById() throws Exception {
		List<Departement> dep = idepartmentService.getAllDepartements();
	    EntrepriseService.deleteDepartementById(dep.get(0).getId());
	    
	}
	
}
