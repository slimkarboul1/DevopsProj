package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.DepartementServiceImpl;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AliTest {
	@Autowired
	DepartementServiceImpl idepartmentService;
	@Autowired
	EntrepriseServiceImpl ientrepriseservice;
	@Test
	public void testContextLoads() {
		
			this.idepartmentService.getAllDepartements();
	}
	
//	@Test
//	public void addDepartment() {
//		Entreprise ent = new Entreprise("esprit", "test");
//		int idEnt =ientrepriseservice.ajouterEntreprise(ent) ;
//	    assertThat(idEnt).isNotEqualTo(-1);
//	    
//	    
//		
//		Departement dep = new Departement("informatique");
//		int idDep = this.idepartmentService.addOrUpdateDepartment(dep);
//		
//		ientrepriseservice.affecterDepartementAEntreprise(idDep, idEnt);
//}
	
}
