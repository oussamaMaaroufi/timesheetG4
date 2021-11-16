package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.services.IContratService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContratTest {

	@Autowired
	IContratService cs;
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	ContratRepository contratRepository;
	
	@Test
	public void testGetAllContrats(){
		List<Contrat> lc =cs.getAllContrats();
		assertNotNull(lc);
	}
	
	@Test
	public void testAjouterContrat() {
		Date date = new Date();
		Contrat c=new Contrat(date,"Stage",2000);
		Integer idC=cs.ajouterContrat(c);
		assertNotNull(idC);
	}
	
	
	
	@Test
	public void testAffecterContratAEmploye() {
		int employeId = 1 ;
		int idC = 4; //++
		Contrat C = contratRepository.findById(idC).orElse(null);
		Employe Emp = employeRepository.findById(employeId).orElse(null);
		if (C != null){
		C.setEmploye(Emp);
		Contrat c = cs.affecterContratAEmploye(idC, employeId);
		Assert.assertEquals (C.getEmploye().getId(),c.getEmploye().getId());
		}	
	}
	
	@Test
	public void testDeleteContratById() {
		int idC = 4; //++
		int i=cs.deleteContratById(idC);
		assertEquals(0,i);
	}
}


 