package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class FieldjectionTest {

	public static void main(String[] args) {
		//getSpring Container 
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Target Class Object
		WishMessageGenerator generaor1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generaor2=ctx.getBean("wmg",WishMessageGenerator.class);
		//TayeCasting the
		   
		//invoke the the method
		String resultMessage=generaor1.WishMessage("vasu");
		System.out.println("ResultMessage::"+resultMessage);
		 
		System.out.println(generaor1.hashCode()+" "+generaor2.hashCode());
		System.out.println("generator1==generator?"+(generaor1==generaor2));
        
	}

}
