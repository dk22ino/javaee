package ug.pszczupak.restejbjpa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "motorcycle")
@NamedQueries({
        @NamedQuery(name = "motorcycle.all", query = "SELECT m FROM Motorcycle m"),
        @NamedQuery(name = "motorcycle.delete.all", query = "DELETE FROM Motorcycle"),
        @NamedQuery(name="motorcycle.getbyid", query="select m from Motorcycle m where m.id=:id"),
        @NamedQuery(name="motorcycle.getPersonBy", query="select m.owners from Motorcycle m where m.id=:id"),
        @NamedQuery(name="motorcycle.person", query="select p from Person p")
})


public class Motorcycle {
	private long id;
	private Producer producer;
	private String model;
	private Date dateOfProduction;
	private boolean accident;
	private double price;
	private NumberVin numberVin;
	private List<Person> owners = new ArrayList<>();

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false,cascade=CascadeType.REMOVE/*,cascade=CascadeType.ALL*/)  //cascadetype.remove
	@JoinColumn(name = "producer_id", nullable = false)
	public Producer getProducer() {
		return producer;
	}
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getDateOfProduction() {
		return dateOfProduction;
	}
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public void setDateOfProduction(Date dateOfProduction) {
		this.dateOfProduction = dateOfProduction;
	}
	public boolean isAccident() {
		return accident;
	}
	public void setAccident(boolean accident) {
		this.accident = accident;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
	@JoinColumn(name = "vin_id", unique=true)
	public NumberVin getNumberVin() {
		return numberVin;
	}
	public void setNumberVin(NumberVin numberVin) {
		this.numberVin = numberVin;
	}
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.REMOVE/*,cascade=CascadeType.ALL*/)
	@JsonIgnoreProperties({"motorcycles"})
	public List<Person> getOwners() {
		return owners;
	}
	
	@JsonProperty
	public void setOwners(List<Person> owners) {
		this.owners = owners;
	}
}
