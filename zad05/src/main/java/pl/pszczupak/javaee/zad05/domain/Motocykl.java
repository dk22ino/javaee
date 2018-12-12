package pl.pszczupak.javaee.zad05.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Motocykl{

	private String nazwa;
	private int pojemnosc;
	private double przebieg;

	public Motocykl() {
		
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motocykl other = (Motocykl) obj;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		return true;
	}
	
}
