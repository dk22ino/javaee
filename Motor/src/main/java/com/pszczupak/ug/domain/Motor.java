package com.pszczupak.ug.domain;

import java.util.Date;

public class Motor {
	public static int licznik = 0;
	
	private int id;
	private String nazwa;
	private int przebieg;
	private double cena;
	private boolean wypadek;
	private Date dataProdukcji;
	
	public static void zwieksz() {
		licznik++;
	}

	
	//Konstruktor
	public Motor() {

	}
	
	public Motor(String nazwa, int przebieg, double cena, boolean wypadek, Date dataProdukcji) {
		this.id = licznik;
		this.nazwa = nazwa;
		this.przebieg = przebieg;
		this.cena = cena;
		this.wypadek = wypadek;
		this.dataProdukcji = dataProdukcji;
		zwieksz();
	}
	
	
	
	//Settery i Gettery
	public static int getLicznik() {
		return licznik;
	}
	public static void setLicznik(int licznik) {
		Motor.licznik = licznik;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getPrzebieg() {
		return przebieg;
	}
	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public boolean isWypadek() {
		return wypadek;
	}
	public void setWypadek(boolean wypadek) {
		this.wypadek = wypadek;
	}
	public Date getDataProdukcji() {
		return dataProdukcji;
	}
	public void setDataProdukcji(Date dataProdukcji) {
		this.dataProdukcji = dataProdukcji;
	}
	
	
	//Funkcja wyswitlej¹ca wszystkie informacje o egzemplarzu
	public String MotorInfo() {
		String pomoc;
		if(this.wypadek) {pomoc = "Po Wypadku";}
		else {pomoc = "Bezwypadkowy";}
		
		return //"</br>" + "id: " + this.id + "</br>" +
				"Motor nazwa: " + this.nazwa + "</br>" +
				"Motor przebieg: " + this.przebieg + "</br>" + 
				"Motor cena: " + this.cena + "</br>" +
				"Data produkcji: " + this.dataProdukcji + "</br>" + 
				"Wypadkowosc " + pomoc + "</br>";
	}
	
	
	
}
