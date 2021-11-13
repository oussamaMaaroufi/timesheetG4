package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.MissionRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class MissionServiceImpl implements IMissionServices {

	@Autowired
	MissionRepository missionRepository;
	
	
	private static final Logger L = LogManager.getLogger(MissionServiceImpl.class);

	@Override
	public List<Mission> retrieveAllMission() {
	
		List<Mission> mission = null; 
		try {
	
		
			L.info("in method retive all mission");
			mission = (List<Mission>) missionRepository.findAll(); 
			System.out.println("ekhdeeeeee"+mission);
			L.debug("Connection a la BD");
			for (Mission mission1 : mission) {

			  L.debug("Entreprise:" + mission1.getName());
			} 
			
			L.info("out method retive all mission");

			
		}catch (Exception e) {
			L.error("out of method: " + e);

			
		}

		return mission;
	}

	@Override
	public Mission addMission(Mission a) {

		L.info("In methode mission1");

		Mission e_saved = missionRepository.save(a); 
				L.info("Out methode mission1");

				return e_saved; 
	}

	@Override
	public void deleteMission(long id) {
		missionRepository.deleteById((int) id); 
 }

	@Override
	public Mission updateMission(Mission a) {

		L.info("In methode updatemission");

		Mission e_saved = missionRepository.save(a); 

				L.info("Out methode updatemission");

				return e_saved; 
	}

	@Override
	public  Optional <Mission> retrieveMission(int id) {
		L.info("In methode retrieventre");
		

	Optional <Mission> a =  missionRepository.findById(id); 


	a.ifPresent(existingCustomer -> {
	    String nameWeWanted = existingCustomer.getName();
	    //operate on existingCustomer
	});

	 L.error("error in retrieventr() : " + a);



L.info("out methode retrieve");

return a;
	}

	
	

}
