package com.pszczupak.ug.domain;

import java.util.Date;

public class Ankieta {
	public static int licznik = 0;
	
	private int id;
	private Date odKiedy;
	private Date doKiedy;
	private boolean dzien;
	private boolean tydzien;
	private boolean miesiac;
	private boolean silnik;
	private boolean karoseria;
	private boolean papiery;
	
	
	public Ankieta() {
		this.odKiedy = new Date();
		this.doKiedy = new Date();
		this.dzien = false;
		this.tydzien = false;
		this.miesiac = false;
		this.silnik = false;
		this.karoseria = false;
		this.papiery = false;

	}
	
	public Ankieta(Date odKiedy, Date doKiedy, boolean dzien, boolean tydzien, boolean miesiac, boolean silnik,
			boolean karoseria, boolean papiery) {
		super();
		this.odKiedy = odKiedy;
		this.doKiedy = doKiedy;
		this.dzien = dzien;
		this.tydzien = tydzien;
		this.miesiac = miesiac;
		this.silnik = silnik;
		this.karoseria = karoseria;
		this.papiery = papiery;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOdKiedy() {
		return odKiedy;
	}
	public void setOdKiedy(Date odKiedy) {
		this.odKiedy = odKiedy;
	}
	public Date getDoKiedy() {
		return doKiedy;
	}
	public void setDoKiedy(Date doKiedy) {
		this.doKiedy = doKiedy;
	}
	public boolean isDzien() {
		return dzien;
	}
	public void setDzien(boolean dzien) {
		this.dzien = dzien;
	}
	public boolean isTydzien() {
		return tydzien;
	}
	public void setTydzien(boolean tydzien) {
		this.tydzien = tydzien;
	}
	public boolean isMiesiac() {
		return miesiac;
	}
	public void setMiesiac(boolean miesiac) {
		this.miesiac = miesiac;
	}
	public boolean isSilnik() {
		return silnik;
	}
	public void setSilnik(boolean silnik) {
		this.silnik = silnik;
	}
	public boolean isKaroseria() {
		return karoseria;
	}
	public void setKaroseria(boolean karoseria) {
		this.karoseria = karoseria;
	}
	public boolean isPapiery() {
		return papiery;
	}
	public void setPapiery(boolean papiery) {
		this.papiery = papiery;
	}
	
	
	
	
	
}
