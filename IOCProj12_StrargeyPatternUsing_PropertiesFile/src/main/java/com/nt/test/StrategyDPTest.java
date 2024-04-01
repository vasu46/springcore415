package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		//cretae IOC Container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//oget Tarfet Spring bean Class obj
		Object obj=ctx.getBean("fpkt");
	    Flipkart fpkt=(Flipkart)obj;
	    String result=fpkt.shopping(new String[] {"shirt","TRouser"},new double[] {4000.0,6000.0});
	    System.out.println(result);
	    //close container
	    ctx.close();
	}

}
