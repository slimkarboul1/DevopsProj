package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.jsonpath.internal.function.text.Length;

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
	IDepartementService idepartmentService;
	@Autowired
	IEntrepriseService ientrepriseservice;
	
	@Autowired
	IEmployeService iemployeService;
	
	private static final Logger log = LogManager.getLogger(AliTest.class);
	
	@Test
	public void testContextLoads() {
		
		List<Departement> dep = this.idepartmentService.getAllDepartements();
		for (Departement departement : dep) {
			log.warn(departement);
		}
	}
	
	@Test
	public void addDepartment() {
		Entreprise ent = new Entreprise("esprit", "test");
		int idEnt =ientrepriseservice.ajouterEntreprise(ent) ;
	    assertThat(idEnt).isNotEqualTo(-1);
	    
	    
		
		Departement dep = new Departement("informatique");
		int idDep = this.idepartmentService.addOrUpdateDepartment(dep);
		
		ientrepriseservice.affecterDepartementAEntreprise(idDep, idEnt);
}
	
	
	@Test
	public void deleteDepartment() {
	Departement dep = this.idepartmentService.getAllDepartements().get(0);
		this.idepartmentService.deleteDepartment(dep.getId());
	
	}
	
}
