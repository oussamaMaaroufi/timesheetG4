package tn.esprit.spring;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotEquals;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;


import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.log4j.Logger;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.entities.Contrat;
import java.util.Date;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MarweneTest {
	@Autowired
	IEmployeService iemployeservice;
	private static final Logger l = Logger.getLogger(MarweneTest.class);
	@Test
	public void testContextLoads() {
//		
//		l.info("Testing add employe marwene kalboussi");
//    	Employe empl = new Employe("marwene", "kalboussi", "marwene.kalboussi@esprit.tn", "marwene", true,Role.CHEF_DEPARTEMENT );
//    	int id = this.iemployeservice.addOrUpdateEmploye(empl);
//        long start = System.currentTimeMillis();
//        long elapsedTime = System.currentTimeMillis() - start;
//        assertThat(empl.getNom()).isEqualTo("marwene");
//        l.info("temp d execution: " + elapsedTime + " milliseconds.");
//        l.info("End test add employe ");
	}
	
		

		 
//	    @Test
//	    public void getEmployewithid() {
//	    	l.info("Testing get employe premon by id");
//			 String prenom =  this.iemployeservice.getEmployePrenomById(19);
//			 assertThat(prenom.equals("kalboussi"));  
//		 l.info("End get employe premon by id ");
//	    }
//		
//		@Test
//	    public void testajouterContrat() {
//	    	 l.info("Testing ajouter contrat");
//		     Contrat contrat = new Contrat(new Date() ,"svp",1100);
//	        int i = iemployeservice.ajouterContrat(contrat);
//	        Assertions.assertEquals(i, contrat.getReference() );
//	       
//	     
//	      l.info("End ajouter contrat ");
//	    }
//	    
//	    @Test
//	   public  void getNombreEmploye() {
//	        int nombre = iemployeservice.getNombreEmployeJPQL();
//	        Employe employe = new Employe("ahmed", "aribi", "ahmed.aribi@gmail.com", true, Role.CHEF_DEPARTEMENT);
//	        iemployeservice.addOrUpdateEmploye(employe);
//	        int secondNombre = iemployeservice.getNombreEmployeJPQL();
//	        Assertions.assertNotEquals(nombre, secondNombre);
//	        l.info("le nombre des employés est : " + nombre);
//	    }
//		 
//		 
		 
		
	
}

