package ug.pszczupak.restejbjpa.service;


import ug.pszczupak.restejbjpa.domain.NumberVin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class NumberVinManager {

	 @PersistenceContext
	 EntityManager em;

	
	
	 
	    public void addNumberVin(NumberVin number) {
	        em.persist(number);
	    }

	    public NumberVin updateNumberVin(NumberVin number, long id) {
	        number.setId(id);
	        NumberVin old = getNumberVin(id);
	        if(old != null) {
	            em.merge(number);
	        }
	        return old;
	    }

	    
	    public void deleteNumberVin(long id) {
	        NumberVin number = getNumberVin(id);
	        if(number != null) {
	            em.remove(number);
	        }
	    }

	    public NumberVin getNumberVin(long id) {
	        return em.find(NumberVin.class, id);
	    }

	    @SuppressWarnings("unchecked")
	    public List<NumberVin> getAllNumberVin() {
	        return em.createNamedQuery("numberVin.all").getResultList();
	    }

	    @SuppressWarnings("unchecked")
	    public void deleteAllNumberVin(){
	        em.createNamedQuery("numberVin.delete.all").executeUpdate();
	    }
	 
	 
	 
}
