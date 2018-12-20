package com.pszczupak.ug.service;

import java.util.ArrayList;
import java.util.List;

import com.pszczupak.ug.domain.*;

public class KoszykStorage {

	private List<Motor> koszyk = new ArrayList<Motor>();
	
	public void addKoszyk(Motor nowy) {
		Motor koszykowy = new Motor();
		koszykowy.setId(nowy.getId());
		koszykowy.setNazwa(nowy.getNazwa());
		koszykowy.setCena(nowy.getCena());
		koszykowy.setDataProdukcji(nowy.getDataProdukcji());
		koszykowy.setPrzebieg(nowy.getPrzebieg());
		koszykowy.setWypadek(nowy.isWypadek());
		koszyk.add(koszykowy);
	}
	
	public List<Motor> getAllMotor(){
		return koszyk;
	}
	
	public Motor szukaj(int id) {
		
		for(Motor moto : koszyk)
		{
			if(moto.getId() == id) 
			{
				return moto;
			}
		}
		
		return null;
	}
	
	public int ile() {
		int licznik=0;
		for(Motor moto : koszyk)
		{
			licznik++;
		}
		return licznik;
	}
	
	public void deleteMotor(int id) {
		koszyk.remove(szukaj(id));
	}
	
	
}
