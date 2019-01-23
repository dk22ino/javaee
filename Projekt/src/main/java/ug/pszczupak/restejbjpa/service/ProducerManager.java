package ug.pszczupak.restejbjpa.service;


import ug.pszczupak.restejbjpa.domain.Producer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProducerManager {

	  @PersistenceContext
	    EntityManager em;

	  
	  public void addProducer(Producer producer) {
	        em.persist(producer);
	  }

	   public Producer updateProducer(Producer producer, long id) {
	        producer.setId(id);
	        Producer old = getProducer(id);
	        if(old != null) {
	            em.merge(producer);
	        }
	        return old;
	   }  
	   
	   public void deleteProducer(long id) {
	        Producer producer = getProducer(id);
	        if(producer != null) {
	            em.remove(producer);
	        }
	    }
	   
	    public Producer getProducer(long id) {
	        return em.find(Producer.class, id);
	    }	   
	    
	    
	    @SuppressWarnings("unchecked")
	    public List<Producer> getAllProducers() {
	        return em.createNamedQuery("producer.all").getResultList();
	    }	    
  
	    @SuppressWarnings("unchecked")
	    public void deleteAllProducers(){
	        em.createNamedQuery("producer.delete.all").executeUpdate();
	    }	    
	  
}

