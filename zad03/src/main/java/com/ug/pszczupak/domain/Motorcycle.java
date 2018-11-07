package com.ug.pszczupak.domain;

import java.util.Date;

public class Motorcycle {
private int id;
private String name;
private Date dateOfProduction;
private boolean crush;
private double milage;



public Motorcycle() {
	super();

}

public Motorcycle(String name, Date dateOfProduction,boolean crush,double milage) {
	super();
	this.name = name;
	this.dateOfProduction = dateOfProduction;
	this.crush = crush;
	this.milage = milage;
	
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getDateOfProduction() {
	return dateOfProduction;
}

public void setDateOfProduction(Date dateOfProduction) {
	this.dateOfProduction = dateOfProduction;
}

public boolean isCrush() {
	return crush;
}

public void setCrush(boolean crush) {
	this.crush = crush;
}

public double getMilage() {
	return milage;
}

public void setMilage(double milage) {
	this.milage = milage;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}