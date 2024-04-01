package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vec")
public class VotingElgibilityCheck {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	
	private Date verifiedOn; //left Over property
	
	public VotingElgibilityCheck() {
		System.out.println("VotingElgibilityCheck.VotingElgibilityCheck()::0-param Constructor::");
	}
	  
	public void setName(String name) {
		System.out.println("VotingElgibilityCheck.setName()");
		this.name=name;
	}
	public void setAge(int age) {
		System.out.println("VotingElgibilityCheck.setAge()");
		this.age=age;
	}
	public void setVerifiedOn(Date verifiedOn) {
		System.out.println("VotingElgibilityCheck.setVerifiedOn()");
		this.verifiedOn=verifiedOn;
	}
	public String checkVotingEligibility() {
		System.out.println("VotingElgibilityCheck.checkVotingEligibility()");
		if(age>=18)
			return "MR/MRS/MISS."+name+" U r ELigible for the Votinf on date::"+verifiedOn;
		else
			return "MR/MRS/MISS."+name+" U r not  ELigible for the Votinf on date::"+verifiedOn;	
	}
	
	/*public void myInit(){
		System.out.println("VotingElgibilityCheck.myInit()");
	  //intialize the Left over the Property
		verifiedOn=new Date();
		//check wheather important propertieds ar cfg with correct values or not
	  if(name==null || name.trim().length()==0 || age<=0)
		  throw new IllegalArgumentException("Invalid values are injected for spring bean properties(name,age)");
	  }
	public void myDestroy() {
		System.out.println("VotingElgibilityCheck.myDestroy()");
		name=null;
		age=0;
	   }*/

	/*@Override
	public void destroy() throws Exception {
		System.out.println("VotingElgibilityCheck.myDestroy()");
		name=null;
		age=0;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingElgibilityCheck.myInit() method in Predefined");
		//intialize the Left over the Property
		verifiedOn=new Date();
		//check wheather important propertieds ar cfg with correct values or not
		if(name==null || name.trim().length()==0 || age<=0)
			throw new IllegalArgumentException("Invalid values are injected for spring bean properties(name,age)");
		
	  }*/
	    @PostConstruct
	   public void myInit() {
		   System.out.println("VotingElgibilityCheck.myInit()::Annotation");
		   verifiedOn=new Date();
		   if(name==null || name.trim().length()==0 ||age==0)
			   throw new IllegalArgumentException("Invalid values are injected for bean properties(name,age)");
	   }
	   @PreDestroy
	   public void myDistroy() {
		   System.out.println("VotingElgibilityCheck.myDistroy():;using Annotation");
		   name=null;
		   age=0;
	   }
	}


