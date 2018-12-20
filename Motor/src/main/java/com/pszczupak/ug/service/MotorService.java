package com.pszczupak.ug.service;

import java.util.ArrayList;
import java.util.List;

import com.pszczupak.ug.domain.*;

public class MotorService {

	private List<Motor> db = new ArrayList<Motor>();
	
	public void addMotor(Motor newMotor) {
		Motor moto = new Motor(newMotor.getNazwa(),newMotor.getPrzebieg(),newMotor.getCena(),newMotor.isWypadek(),newMotor.getDataProdukcji());
		db.add(moto);
	}
	
	public List<Motor> getAllMotor(){
		return db;
	}
	
	public Motor szukaj(int id) {
		
		for(Motor moto : db)
		{
			if(moto.getId() == id) 
			{
				return moto;
			}
		}
		
		return null;
	}
	
	public void deleteMotor(int id) {
		db.remove(szukaj(id));
	}
	
	
	
	
}
