package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	 //take dependent calss 
	private LocalDateTime dateTime;
	private Date date;
	
	//generator setter method
	//setter Injection for Multiple Fields
	/* @Autowired 
	 public void setDateTime(LocalDateTime dateTime) {
	 this.dateTime=dateTime;
	 }*/
		/* @Autowired
		 public void setDate(Date date) {
		  this.date=date;
		 }*/
	/*  @Autowired
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator::2-param Constructor");
		this.dateTime=dateTime;
		this.date=date;
	}*/
	   
		  @Autowired
		public WishMessageGenerator(LocalDateTime dateTime,Date date) {
			System.out.println("WishMessageGenerator::2-param Constructor");
			this.dateTime=dateTime;
			this.date=date;
		}
		  
			
	 
	//B method
	public String WishMessage(String user) {
		//get Cuurent Hour
		int hour=dateTime.getHour();
		if(hour<=12)
			return  "Good Morning::"+user;
		else if(hour<16)
			 return "Good OfterNoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
		return "Good Night::"+user;
		
	}

}
