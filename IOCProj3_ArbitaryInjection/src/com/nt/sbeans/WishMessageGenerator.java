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
	//Arbitary methods
	  @Autowired
	 public void assignSysDt(LocalDateTime ldt) {
		 System.out.println("WishMessageGenerator.assignSysDt()");
		 this.dateTime=ldt;
		}//method1
	  @Autowired
	 public void putDt(Date date) {
		 System.out.println("WishMessageGenerator.putDt()");
		 this.date=date;
	   }//method2
	 
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
