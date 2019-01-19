package com.pszczupak.ug.service;

import com.pszczupak.ug.domain.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





public class TwisterService {

	private List<Twister> db = new ArrayList<Twister>();
	
	public void addTwister(Twister nowy) {
		db.add(nowy);
	}
	
	public List<Twister> getTwister(){
		return db;
	}
	
	public Twister szukaj(int id) {
		
		for(Twister twist : db)
		{
			if(twist.getId() == id) 
			{
				return twist;
			}
		}
		
		return null;
	}
	
	public void deleteTwister(int id) {
		db.remove(szukaj(id));
	}
	
	
	public int ile() {
		int licznik=0;
		for(Twister moto : db)
		{
			licznik++;
		}
		return licznik;
	}
	
	
	
}
