package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Mission;

public interface IMissionServices {
	List< Mission> retrieveAllMission(); 
	 Mission addMission( Mission a);
	void deleteMission(long id);
	 Mission updateMission( Mission a);
	 Optional <Mission> retrieveMission(int id);

}
