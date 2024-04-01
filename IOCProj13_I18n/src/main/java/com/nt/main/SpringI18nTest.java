package com.nt.main;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		//Create Object of IOC CONTAINER
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Create Object Of Locale
		Locale locale=new Locale(args[0],args[1]);
		//getmessage from the locale specifice or base properties file
		String msg1=ctx.getMessage("welcome.msg",new Object[] {},locale);
		String msg2=ctx.getMessage("goodbye.msg",new Object[] {},locale);
		System.out.println(msg1+" "+msg2);
		
		//close the container
		 ctx.close();
	}
}
