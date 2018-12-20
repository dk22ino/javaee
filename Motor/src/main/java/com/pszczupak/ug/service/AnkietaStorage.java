package com.pszczupak.ug.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pszczupak.ug.domain.*;

public class AnkietaStorage {
	
	List<Ankieta> ankieta = new ArrayList<Ankieta>();
	
	public void addAnkieta(Ankieta nowy) 
	{
		Ankieta x = new Ankieta();
		x.setId(nowy.getId());
		x.setDoKiedy(nowy.getDoKiedy());
		x.setOdKiedy(nowy.getOdKiedy());
		x.setDzien(nowy.isDzien());
		x.setMiesiac(nowy.isMiesiac());
		x.setTydzien(nowy.isTydzien());
		x.setKaroseria(nowy.isKaroseria());
		x.setSilnik(nowy.isSilnik());
		x.setPapiery(nowy.isPapiery());
		ankieta.add(x);
	}
	
	public List<Ankieta> AllAnkieta(){
		return ankieta;
	} 
	
	
}
