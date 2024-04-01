package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.support.FileSystemXmlApplicationContext;



public class SingleytonScopeTest {

	public static void main(String[] args) {
		//getSpring Container 
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Target Class Object
		LocalDateTime dt1=ctx.getBean("ldt",LocalDateTime.class);
		LocalDateTime dt2=ctx.getBean("ldt",LocalDateTime.class);
	     System.out.println(dt1.hashCode()+"...."+dt2.hashCode());
	     System.out.println(dt1.getClass()+", "+dt2.getClass());
	     
	     System.out.println("(dt1==dt2?)"+(dt1==dt2));//return true;
	}

}
