package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator {
	
	@Autowired
	private LocalDateTime dateTime;
	
	
	
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
