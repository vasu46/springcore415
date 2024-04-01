package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime dateTime;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//get Cuurent HOUR
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Morning"+user;
		else if(hour<16)
			return "GoodOfternoon"+user;
		
		else if(hour<20)
		return "GoodEvening"+user;
		
		else
	      return "Good Night::"+user;
	}
   
}
