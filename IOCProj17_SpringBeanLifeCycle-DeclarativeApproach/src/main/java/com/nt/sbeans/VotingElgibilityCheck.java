package com.nt.sbeans;

import java.util.Date;

public class VotingElgibilityCheck {
	private String name;
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
	public void myInit(){
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
	   }
	}


