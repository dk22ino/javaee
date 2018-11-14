package com.ug.pszczupak.service;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.ug.pszczupak.domain.Motorcycle;
import com.ug.pszczupak.service.StorageService;

public class BasketStorage {

	private List<Motorcycle> basket = new ArrayList<Motorcycle>();


	public void addToBasket(Motorcycle motor){
		basket.add(motor);
	}

	public List<Motorcycle> getBasket(){
		return basket;
	}

	public Motorcycle getMotor(String name, StorageService ss) {
		
		Motorcycle motor;
		//StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
		
		List<Motorcycle> db = ss.getAllMotorcycles();
		
		for(int i=0;i<=db.size()+1;i++)
		{
			motor = db.get(i);
			if(motor.getName().equals(name))
				return motor;	
		}
		
		return null;
	}
	
	

}
