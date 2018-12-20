package com.pszczupak.ug.domain;

import java.util.Date;

public class Magazyn {
	
	
	private String imie;
	private Date odKiedy;
	private Date doKiedy;
	private boolean dzien;
	private boolean tydzien;
	private boolean miesiac;
	private boolean silnik;
	private boolean motor;
	private boolean wypadki;
	
	
	
	public Magazyn(String imie, Date odKiedy, Date doKiedy, boolean dzien, boolean tydzien, boolean miesiac,
			boolean silnik, boolean motor, boolean wypadki) {
		super();
		this.imie = imie;
		this.odKiedy = odKiedy;
		this.doKiedy = doKiedy;
		this.dzien = dzien;
		this.tydzien = tydzien;
		this.miesiac = miesiac;
		this.silnik = silnik;
		this.motor = motor;
		this.wypadki = wypadki;
	}
	
	
	public Magazyn() {	
		this.imie = "";
		this.odKiedy = new Date();
		this.doKiedy = new Date();
		this.dzien = false;
		this.tydzien = false;
		this.miesiac = false;
		this.silnik = false;
		this.motor = false;
		this.wypadki = false;
	}
	
	
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
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
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	public boolean isWypadki() {
		return wypadki;
	}
	public void setWypadki(boolean wypadki) {
		this.wypadki = wypadki;
	}
	
	
	
	public void Zmien(String imie, Date odKiedy, Date doKiedy, boolean dzien, boolean tydzien, boolean miesiac,
			boolean silnik, boolean motor, boolean wypadki) {
		this.imie = imie;
		this.odKiedy = odKiedy;
		this.doKiedy = doKiedy;
		this.dzien = dzien;
		this.tydzien = tydzien;
		this.miesiac = miesiac;
		this.silnik = silnik;
		this.motor = motor;
		this.wypadki = wypadki;
	}
	
	
	
}
