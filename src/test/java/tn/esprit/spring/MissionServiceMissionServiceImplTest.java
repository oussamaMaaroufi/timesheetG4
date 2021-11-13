package tn.esprit.spring;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IMissionServices;
@SpringBootTest
public class MissionServiceMissionServiceImplTest {
	
	@Autowired
	IMissionServices missionService;
	
	
	

	/*@Test
	public void testRetrieveAllMission() {
		List<Mission> ListeMission = missionService.retrieveAllMission();
		Assertions.assertEquals(2, ListeMission.size());*/

	
	//succes
	@Test
	  public void addMission() throws ParseException{
		  Mission e = new Mission();
		  
	Mission entrepriseAdded = missionService.addMission(e);
	 Assertions.assertEquals(e.getDescription(),entrepriseAdded.getDescription());
	 
	
	
	
}}

