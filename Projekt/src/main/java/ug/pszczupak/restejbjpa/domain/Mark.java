package ug.pszczupak.restejbjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Mark")
@NamedQueries({
        @NamedQuery(name = "mark.all", query = "SELECT m FROM Mark m"),
        @NamedQuery(name = "mark.delete.all", query = "DELETE FROM Mark")
})


public class Mark {
	
	private long id;
	private String name;		//nazwa
	private String origin;		//pochodzenie
	private int yearOfCreation;	//rok utworzenia
	
	public Mark() {
		
	}
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}
	
}
