package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		//cretae the IOC CONTRINNER
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		  Cricketer cktr=ctx.getBean("cktr",Cricketer.class);
		  System.out.println(cktr.batting());
		  System.out.println(cktr.bowling());
		  System.out.println(cktr.fileding());
		  System.out.println("=============================");
		  System.out.println(cktr.batting());
		  
		  //close the container
		  ctx.close();

	}

}
