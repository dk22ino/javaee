package ug.pszczupak.restejbjpa.service;


import ug.pszczupak.restejbjpa.domain.Mark;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MarkManager {

	  @PersistenceContext
	    EntityManager em;

	  
	  public void addMark(Mark marka) {
	        em.persist(marka);
	  }

	   public Mark updateMark(Mark marka, long id) {
	        marka.setId(id);
	        Mark old = getMark(id);
	        if(old != null) {
	            em.merge(marka);
	        }
	        return old;
	   }  
	   
	   public void deleteMark(long id) {
	        Mark marka = getMark(id);
	        if(marka != null) {
	            em.remove(marka);
	        }
	    }
	   
	    public Mark getMark(long id) {
	        return em.find(Mark.class, id);
	    }	   
	    
	    
	    @SuppressWarnings("unchecked")
	    public List<Mark> getAllMarks() {
	        return em.createNamedQuery("mark.all").getResultList();
	    }	    
  
	    @SuppressWarnings("unchecked")
	    public void deleteAllMarks(){
	        em.createNamedQuery("mark.delete.all").executeUpdate();
	    }	    
	  
}
