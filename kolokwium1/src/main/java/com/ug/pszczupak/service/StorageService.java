package com.ug.pszczupak.service;

import java.util.ArrayList;
import java.util.List;
import com.ug.pszczupak.domain.Motorcycle;
public class StorageService {
	
		
		private List<Motorcycle> db = new ArrayList<Motorcycle>();

		
		public void add(Motorcycle motorcycle){
			//Motorcycle newmotor = new Motorcycle(motorcycle.getName(),motorcycle.getDateOfProduction(),motorcycle.isCrush(),motorcycle.getMilage());
			db.add(motorcycle);
		}
		
	
		
		public List<Motorcycle> getAllMotorcycles(){
			return db;
		}
		

	
}

