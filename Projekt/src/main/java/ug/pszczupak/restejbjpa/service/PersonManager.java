package ug.pszczupak.restejbjpa.service;

import ug.pszczupak.restejbjpa.domain.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PersonManager {

    @PersistenceContext
    EntityManager em;
    
    
    public void addPerson(Person person) {
        em.persist(person);
    }

    public Person updatePerson(Person person, long id) {
        person.setId(id);
        Person old = getPerson(id);
        if(old != null) {
            em.merge(person);
        }
        return old;
    }

    public void deletePerson(long id) {
        Person person = getPerson(id);
        if(person != null) {
            em.remove(person);
        }
    }

    public Person getPerson(long id) {
        return em.find(Person.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Person> getAllPerson() {
        return em.createNamedQuery("person.all").getResultList();
    }

    @SuppressWarnings("unchecked")
    public void deleteAllPerson(){
        em.createNamedQuery("person.delete.all").executeUpdate();
    }   
    
    
	
}
