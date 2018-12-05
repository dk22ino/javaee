package pl.pszczupak.javaee.zad05.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Motocykl{

	private String nazwa;
	private int pojemnosc;
	private double przebieg;


	public Motocykl() 
	{
		
	}
	
	public Motocykl(String nazwa, int pojemnosc, double przebieg) {
		super();
		this.nazwa = nazwa;
		this.pojemnosc = pojemnosc;
		this.przebieg = przebieg;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getPojemnosc() {
		return pojemnosc;
	}
	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	public double getPrzebieg() {
		return przebieg;
	}
	public void setPrzebieg(double przebieg) {
		this.przebieg = przebieg;
	}
	
	
}
