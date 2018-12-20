package com.pszczupak.ug.service;

import java.util.ArrayList;
import java.util.List;

import com.pszczupak.ug.domain.Magazyn;

public class MagazynStorage {
	List<Magazyn> magazyn = new ArrayList<Magazyn>();
	
	public void addMagazyn(Magazyn nowy) 
	{
		Magazyn x = new Magazyn(nowy.getImie(),nowy.getOdKiedy(),nowy.getDoKiedy(),nowy.isDzien(),nowy.isTydzien(),nowy.isMiesiac(),nowy.isSilnik(),nowy.isMotor(),nowy.isWypadki());
		
		magazyn.add(x);
	}
	
	public List<Magazyn> AllMagazyn(){
		return magazyn;
	} 
	
	public Magazyn Sprawdz(String x) {
		for(Magazyn m: magazyn) {
			if(m.getImie().equals(x))
			{
				return m;
			}
		}
		return null;
	}
	

}
