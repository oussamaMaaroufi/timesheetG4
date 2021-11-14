package tn.esprit.spring;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarweneTest {
	@Autowired
	IEmployeService iemployeservice;
	@Test
	public void testContextLoads() {
		System.out.println("rim zouari");
		Employe empl = new Employe("rim", "zouari", "rim.zouari@esprit.tn", "rim", true,Role.CHEF_DEPARTEMENT );
		int id = this.iemployeservice.addOrUpdateEmploye(empl);
		 assertThat(empl.getNom()).isEqualTo("rim");
	}
}

