package tn.esprit.spring;


import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@SpringBootTest
public class AlaTest {

	
	@Autowired
	private EntrepriseServiceImpl EntrepriseService;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(EntrepriseService).isNotNull();
		Entreprise Company = new Entreprise("alaa inc","alaa inc");
		assertThat(EntrepriseService.ajouterEntreprise(Company)).isNotEqualTo(-1);
	}
}
