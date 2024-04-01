package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class FieldjectionTest {

	public static void main(String[] args) {
		//getSpring Container 
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Target Class Object
		Object obj=ctx.getBean("wmg");
		//TayeCasting the
		WishMessageGenerator generator=(WishMessageGenerator) obj;
		//invoke the the method
		String resultMessage=generator.WishMessage("vasu");
		System.out.println("ResultMessage::"+resultMessage);
        generator.dispaly();
	}

}
