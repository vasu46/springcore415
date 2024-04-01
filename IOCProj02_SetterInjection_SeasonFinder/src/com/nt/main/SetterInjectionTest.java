package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinderGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	//get Spring Bean 
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get back to spring container
		Object obj=ctx.getBean("seag");
		//typeCastin
		SeasonFinderGenerator  generator=(SeasonFinderGenerator) obj;
	String result=generator.SeasonFinder("ANJANA");
	System.out.println(result);
		
     ctx.close();
	}

}
