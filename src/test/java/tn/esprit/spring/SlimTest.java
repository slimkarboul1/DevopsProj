package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.ITimesheetService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SlimTest {
	@Autowired
	ITimesheetService itimesheetservice;
	@Test
	public void testContextLoads() {
		System.out.println("Slim branch");
        this.itimesheetservice.getAllEmployeByMission(1);
	}
}
