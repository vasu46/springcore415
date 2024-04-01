package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	private LocalDateTime dateTime;
	
	//setter method for seeter Injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime=dateTime;
	 }
	//b method
	public String genereateMessage(String user) {
		//get current hour of the ady
		int hour=dateTime.getHour();
		//generate thwe wish messhae
		if(hour<12)
			return "GoodMorning::"+user;
		else if(hour<16)
			return "Good OfterNoon::"+user;
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night::"+user;
		
	
	}
	
	

}
