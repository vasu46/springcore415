package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingElgibilityCheck;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
	//create IOC CONTAINER
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	System.out.println("=========================");
	
	VotingElgibilityCheck vec=ctx.getBean("vec",VotingElgibilityCheck.class);
	
	//invoke The Business Method
	try {
		String result=vec.checkVotingEligibility();
		System.out.println(result);
	  }
	catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("=================================");
	 ctx.close();
	
  }
}
