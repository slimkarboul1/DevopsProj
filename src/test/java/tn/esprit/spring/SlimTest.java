package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.entities.TimesheetPK;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.repository.TimesheetRepository;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.ITimesheetService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SlimTest {
	@Autowired
	ITimesheetService itimesheetservice;
	@Autowired
	IDepartementService idepartmentService;
	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	MissionRepository missionrepo;
	
	private static final Logger log = LogManager.getLogger(SlimTest.class);
	
//	@Test
//	public void testContextLoads() {
//		
//		Date datedebut = new Date(2021,2,11);
//		Date datefin = new Date(2021,6,11);
//		TimesheetPK pk = new TimesheetPK(1,1,datedebut,datefin);
//		Departement dep = new Departement("informatique");
//		int idDep = this.idepartmentService.addOrUpdateDepartment(dep);
//		
//		Employe empl = new Employe("slim", "karboul", "slim.karboul@esprit.tn", "slim", true,Role.CHEF_DEPARTEMENT );
//		int id = this.iemployeservice.addOrUpdateEmploye(empl);
//		 this.iemployeservice.affecterEmployeADepartement(id, idDep);
//		
//		 
//		 	MissionExterne mexterne = new MissionExterne("m1","m1","email",1);
//		 	missionrepo.save(mexterne);
//			Timesheet tms = new Timesheet(pk,mexterne, empl, true);
//			itimesheetservice.ajouterTimesheet(mexterne.getId(), empl.getId(), datedebut, datefin);
//		
//        
//	}
//	
//	@Test
//	public void editTimesheet() {
//		log.info("editing timesheet test");
//		
//		List<Employe> myList = this.itimesheetservice.getAllEmployeByMission(1);
//		String mail = "new new email";
//		Employe employeEdit = myList.get(0);
//		this.iemployeservice.mettreAjourEmailByEmployeId(mail, employeEdit.getId());
//		Employe empToTest = this.iemployeservice.getEmployeById(employeEdit.getId()).get();
//		assertThat(empToTest.getEmail()).isEqualTo("new new email");
//	}
	
//	@Test
//	public void delteTimesheet() {
//		Employe emp = this.iemployeservice.getAllEmployes().get(0);
//		Date datedebut = new Date(2021,2,11);
//		Date datefin = new Date(2021,6,11);
//		log.info("deleting timesheet test");
//		TimesheetPK pk = new TimesheetPK(1,emp.getId(),datedebut,datefin);
//		Timesheet timesheet = this.itimesheetservice.getAllTimeSheet().get(0);
//		this.itimesheetservice.deleteTimesheetById(timesheet);
//
//	}
}

