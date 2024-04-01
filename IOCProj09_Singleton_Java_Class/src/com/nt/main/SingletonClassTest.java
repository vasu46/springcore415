package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.Painter;

public class SingletonClassTest  {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	
		 Painter p1=ctx.getBean("p1",Painter.class);
		 Painter p2=ctx.getBean("p1",Painter.class);
	     
	     System.out.println(p1.hashCode()+" "+p2.hashCode());
	     System.out.println("p1==p2?"+(p1==p2));
	     
	     Painter p3=ctx.getBean("p2",Painter.class);
		 Painter p4=ctx.getBean("p2",Painter.class);
	    
	     
	     System.out.println(p3.hashCode()+" "+p3.hashCode());
	     System.out.println("p3==p4?"+(p3==p4));
	    
	     
	     
		
    
	}

}