package com.ug.pszczupak.service;

import java.util.ArrayList;
import java.util.List;
import com.ug.pszczupak.domain.NewsletterUser;
public class NewsletterStorage {
	
		
		private List<NewsletterUser> db = new ArrayList<NewsletterUser>();

		
		public void add(NewsletterUser user){
			db.add(user);
		}
		
	
		
		public List<NewsletterUser> getAllUser(){
			return db;
		}
		
}
		

	