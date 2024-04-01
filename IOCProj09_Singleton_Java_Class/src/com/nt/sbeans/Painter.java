package com.nt.sbeans;
public class Painter {
	//CRETAE INSTANCE VARIABLE
	private static Painter INSTAENCE;
	
	//CREATE PRIVATE cONSTRUCTOE
	private Painter() {
		System.out.println("Painter.Painter()::0-paramConstructor");
	}
	public static Painter getInstance() {
		System.out.println("Painter.getInstance()::method");
		if(INSTAENCE==null) {
			INSTAENCE=new Painter();	
			
		}
		return  INSTAENCE;
		
	}
	

	
	
	
}
	
  