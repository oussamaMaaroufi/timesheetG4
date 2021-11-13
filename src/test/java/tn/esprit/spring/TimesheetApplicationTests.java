package tn.esprit.spring;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@SpringBootTest
class TimesheetApplicationTests {

	@Test
	void contextLoads() {
		Entreprise e = new Entreprise("SSII","Ghazela");
		EntrepriseServiceImpl Entimp = new EntrepriseServiceImpl();
		Entimp.ajouterEntreprise(e);
		
		Departement d = new Departement("BH");
		Entimp.ajouterDepartement(d);
		
		Entimp.affecterDepartementAEntreprise(1, 1);
		
		List<String> lnoms = Entimp.getAllDepartementsNamesByEntreprise(1);
		for(String nom:lnoms){
		//	l.info(nom);
			System.out.print(nom);
		}
	//	l.info("test test")
		System.out.print("test");
		
	}

}
