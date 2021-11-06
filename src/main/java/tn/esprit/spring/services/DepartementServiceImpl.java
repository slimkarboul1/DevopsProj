package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {

	private static final Logger log = LogManager.getLogger(DepartementServiceImpl.class);
	@Autowired
	DepartementRepository deptRepoistory;


	public List<Departement> getAllDepartements() {
		log.warn("List Departement teessssssssssssst");
		return (List<Departement>) deptRepoistory.findAll();
	}


	@Override
	public int addOrUpdateDepartment(Departement department) {
		  log.warn("On ajoute un department");
			deptRepoistory.save(department);
			log.warn("department ajouté");
			return department.getId();
	}
	
	

}
