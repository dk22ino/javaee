package com.pszczupak.ug.domain;

import java.util.Date;

public class Twister {
	public static int licznik = 0;
	


	private int id;
	private String nazwa;
	private double cena;
	private Date dataProdukcji;
	private boolean dzieci;
	private boolean mlodziez;
	private boolean dorosli;
	private boolean kolo;
	private boolean kwadrat;
	private boolean trojkat;
	

	public Twister() {}
	

	public Twister(String nazwa, double cena, Date dataProdukcji, boolean dzieci, boolean mlodziez, boolean dorosli,
			boolean kolo, boolean kwadrat, boolean trojkat) {
		super();
		this.id = licznik++;
		this.nazwa = nazwa;
		this.cena = cena;
		this.dataProdukcji = dataProdukcji;
		this.dzieci = dzieci;
		this.mlodziez = mlodziez;
		this.dorosli = dorosli;
		this.kolo = kolo;
		this.kwadrat = kwadrat;
		this.trojkat = trojkat;
	}
	
	
	public static int getLicznik() {
		return licznik;
	}
	public static void setLicznik(int licznik) {
		Twister.licznik = licznik;
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
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public Date getDataProdukcji() {
		return dataProdukcji;
	}
	public void setDataProdukcji(Date dataProdukcji) {
		this.dataProdukcji = dataProdukcji;
	}
	public boolean isDzieci() {
		return dzieci;
	}
	public void setDzieci(boolean dzieci) {
		this.dzieci = dzieci;
	}
	public boolean isMlodziez() {
		return mlodziez;
	}
	public void setMlodziez(boolean mlodziez) {
		this.mlodziez = mlodziez;
	}
	public boolean isDorosli() {
		return dorosli;
	}
	public void setDorosli(boolean dorosli) {
		this.dorosli = dorosli;
	}
	public boolean isKolo() {
		return kolo;
	}
	public void setKolo(boolean kolo) {
		this.kolo = kolo;
	}
	public boolean isKwadrat() {
		return kwadrat;
	}
	public void setKwadrat(boolean kwadrat) {
		this.kwadrat = kwadrat;
	}
	public boolean isTrojkat() {
		return trojkat;
	}
	public void setTrojkat(boolean trojkat) {
		this.trojkat = trojkat;
	}
	
}
