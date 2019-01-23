package ug.pszczupak.restejbjpa.service;


import ug.pszczupak.restejbjpa.domain.Motorcycle;
import ug.pszczupak.restejbjpa.domain.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MotorcycleManager {

	@PersistenceContext
	EntityManager em;
	
	
	
	
	public void addMotorcycle(Motorcycle motor) {
		em.persist(motor);
	}

	public Motorcycle updateMotorcycle(Motorcycle motor, long id) {
		motor.setId(id);
		Motorcycle old = getMotorcycle(id);
		if(old != null) {
			em.merge(motor);
		}
		return old;
	}

	public void deleteMotorcycle(long id) {
		Motorcycle motor = getMotorcycle(id);
		if(motor != null) {
			em.remove(motor);
		}
 	}

	public Motorcycle getMotorcycle(long id) {
		return em.find(Motorcycle.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Motorcycle> getAllMotorcycle(){
		return em.createNamedQuery("motorcycle.all").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getallperson(){
		return em.createNamedQuery("motorcycle.person").getResultList();
	}
	
	public void deleteAllMotorcycle(){
		em.createNamedQuery("motorcycle.delete.all").executeUpdate();
	}
	
	
	
	
}
