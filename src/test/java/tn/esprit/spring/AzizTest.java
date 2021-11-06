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
	
	
	@Test
	public void updateContratTest()  {
		assertThat(contratService).isNotNull();
		Contrat contrat = new Contrat(new Date(),"CDI",1580);
	int ref=	contratService.ajouterContrat(contrat);
		Contrat updates = new Contrat(new Date(),"CDI",2580);
		assertThat(contratService.updateContratById(ref, updates)).isNotEqualTo(null);
	}
	
	
	@Test
	public void deleteContratTest()  {
		assertThat(contratService).isNotNull();
		Contrat contrat = new Contrat(new Date(),"CDI",1580);
		int ref=	contratService.ajouterContrat(contrat);
		assertThat(contratService.deleteContratById(ref)).isNotEqualTo(null);
	}
	
	@Test
	public void getContratTest()  {
		assertThat(contratService).isNotNull();
		Contrat contrat = new Contrat(new Date(),"CDI",4440);
		int ref=	contratService.ajouterContrat(contrat);
	
		assertThat(contratService.getContratById(ref)).isNotEqualTo(null);
	}
	
	
	@Test
	public void getAllTest()  {
		assertThat(contratService).isNotNull();
		
	
		assertThat(contratService.getAllContrats()).isNotEqualTo(null);
	}
	
}
