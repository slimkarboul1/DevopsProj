package tn.esprit.spring;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.services.ContratServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AzizTest {
	@Autowired
	private ContratServiceImpl contratService;
	@Test
	public void contextLoads()  {
		assertThat(contratService).isNotNull();
		Contrat contrat = new Contrat(new Date(),"CDI",1580);
		assertThat(contratService.ajouterContrat(contrat)).isNotEqualTo(-1);
	}
}
