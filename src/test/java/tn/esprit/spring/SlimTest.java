package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class KhalilTest {
	private static final Logger l = LogManager.getLogger(KhalilTest.class);
	@Autowired
	IEmployeService iemployeservice;
	
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	IDepartementService idepartmentService;
	@Test
	public void testContextLoads() {
		Entreprise ent = new Entreprise("esprit", "test");
		int idEnt =ientrepriseservice.ajouterEntreprise(ent) ;
	    assertThat(idEnt).isNotEqualTo(-1);
	    
	    
		
		Departement dep = new Departement("informatique");
		int idDep = this.idepartmentService.addOrUpdateDepartment(dep);
		
		ientrepriseservice.affecterDepartementAEntreprise(idDep, idEnt);
		l.info("started adding employee test");
		Employe empl = new Employe("khalil", "sayhi", "khalil.sayhi1@esprit.tn", "khalil", true,Role.CHEF_DEPARTEMENT );
		int id = this.iemployeservice.addOrUpdateEmploye(empl);
		 this.iemployeservice.affecterEmployeADepartement(id, idDep);
		 assertThat(empl.getNom()).isEqualTo("khalil");
		 l.info("affection reussite done");
	}
	@Test
	public void editEmploye() {
		l.info("editing employe test");
		
		List<Employe> myList = this.iemployeservice.getAllEmployes();
		String mail = "new email";
		Employe empToEdit = myList.get(0);
		this.iemployeservice.mettreAjourEmailByEmployeId(mail, empToEdit.getId());
		Employe empToTest = this.iemployeservice.getEmployeById(empToEdit.getId()).get();
		assertThat(empToTest.getEmail()).isEqualTo("new email");
	}
	
	@Test(expected = NoSuchElementException.class)
	public void deleteEmploye() {
		l.info("deleting employe test");
		Employe empToEdit = this.iemployeservice.getAllEmployes().get(0);
		this.iemployeservice.deleteEmployeById(empToEdit.getId());
		Employe empToTest = this.iemployeservice.getEmployeById(empToEdit.getId()).get();
		assertNull(empToTest);
	}
}
