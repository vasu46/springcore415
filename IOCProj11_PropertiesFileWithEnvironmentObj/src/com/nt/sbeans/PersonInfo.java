package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource("com/nt/commons/Info.properties")
public class PersonInfo {
	  @Autowired
	   private Environment env;
	  
	@Override
	  public String toString() {
		  return "name::"+env.getProperty("per.name")+"\n age::"+env.getProperty("per.age")+"\n address::"+env.getProperty("per.addrs")+"\n osname::"+env.getProperty("os.name")+"\n path data::"+env.getProperty("path");
	}
	

}
