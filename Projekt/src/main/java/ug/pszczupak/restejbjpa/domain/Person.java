package ug.pszczupak.restejbjpa.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedQueries({
@NamedQuery(name="person.all", query="select p from Person p"),
@NamedQuery(name="person.getbyid", query="select p from Person p where p.id=:id"),
@NamedQuery(name = "person.delete.all", query = "DELETE FROM Person")
})



public class Person {
	private long id;
	private String name;
	private String lastName;
	private List<Motorcycle> motorcycles = new ArrayList<>();
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@ManyToMany(fetch=FetchType.EAGER,mappedBy="owners")
	@JsonIgnoreProperties("owners")
	public List<Motorcycle> getMotorcycles() {
		return motorcycles;
	}
	@JsonProperty
	public void setMotorcycles(List<Motorcycle> motorcycles) {
		this.motorcycles = motorcycles;
	}
	
	
}
