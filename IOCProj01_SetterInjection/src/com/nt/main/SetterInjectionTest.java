package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	  //create IOC Ccontainer(ApplicationContext)
FileSystemXmlApplicationContext ctx=
		new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	//get Target spring bean class obj 
Object obj=ctx.getBean("wmg");
//type casting with sub class
WishMessageGenerator generator=(WishMessageGenerator) obj;
//Invoking the b.methiod
String resultMsg=generator.genereateMessage("raja");
System.out.println("result msg::"+resultMsg);
   ctx.close();
	}

}
