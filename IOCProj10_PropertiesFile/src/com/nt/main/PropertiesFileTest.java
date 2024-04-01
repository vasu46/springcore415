package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		 System.out.println(info);
		 //close container
		 ctx.close();
	}

}
