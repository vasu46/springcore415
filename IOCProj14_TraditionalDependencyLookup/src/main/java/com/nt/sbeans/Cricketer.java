package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@Lazy(true)
public class Cricketer {
	 public Cricketer() {
		 System.out.println("Cricketer.Cricketer():0-paramConstructor");
	 }
 public String batting() {
	 //cretae IOC CONTAINRT
	 ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 //get Dependent objcet
	 CricketBat bat=ctx.getBean("cBat",CricketBat.class);
	 int runs=bat.scoreRuns();
	 return "Cricket is batting"+bat.scoreRuns();
 }
 public String bowling() {
	 return "Cricketter is bowling";
	 
 }
 public String wicketKeeping() {
	 return "Cricketer is keeping the wickets";
	 
 }
 public String filding() {
	 return "Cricketer is fileding the ball";
 }
}
