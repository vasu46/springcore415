package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 @Component("seag")
public class SeasonFinderGenerator {
	
  private LocalDateTime dateTime;

	/* @Autowired
	public void setDateTime(LocalDateTime dateTime) {
	  this.dateTime=dateTime;
	 }*/
  //constructor
      public SeasonFinderGenerator(LocalDateTime dateTime) {
    	  System.out.println("SeasonFinderGenerator::0 Param Construcor");
    	  this.dateTime=dateTime;
      }
  //Bmethid
  public String SeasonFinder(String user) {
	    //get current Method
	  int month=dateTime.getMonthValue();
	  if(month<=3)
		  return "Winnter Season"+user;
      else if(month<=6)
    	  return "Summer season::"+user;
      else if(month<=9)
    	    return "Rainy Season::"+user;
      else 
	   return "Manson Season::"+user;
			   
	  
  }
}
