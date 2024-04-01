package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	 //take dependent calss 
	@Autowired
	private LocalDateTime dateTime;
	@Autowired
	private Date date;
	
	@Value("30")
	private int age;
	@Value("anjana")
	private String name;
	
	public void setAge(int age) {
		this.age=age;
	}
	 public void setName(String name) {
		 this.name=name;
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
	public void dispaly() {
		System.out.println("age::"+age);
		System.out.println("name::"+name);
	}

}
