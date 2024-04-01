package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		 System.out.println(info);
		 
		 System.out.println("==================================");
		 Environment env=ctx.getEnvironment();
		 System.out.println("name:"+env.getProperty("per.name")+"\n age::"+env.getProperty("per.age")+"\n addrs::"+env.getProperty("per.addrs"));
		 
		 //close container
		 ctx.close();
	}

}
