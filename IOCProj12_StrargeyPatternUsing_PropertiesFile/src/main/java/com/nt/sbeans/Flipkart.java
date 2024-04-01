package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("com/nt/commons/Info.properties")
@Component("fpkt")
public class Flipkart {
	@Autowired
	@Qualifier("shipper")
	private ICourier courier;
	
	//b method
	public String shopping(String items[],double prices[]) {
		//Calculate bill amount
		double billAmount=0.0;
		for(double p:prices) {
			billAmount=billAmount+p;
			
		}
		//generate the orderid(random numebr as the order)
		int oid=new Random().nextInt(1000);
		//deliver the products
		String msg=courier.deliver(oid);
		
		return Arrays.toString(items)+"items with billAMount:::"+billAmount+"----"+msg;
		
	}
	

}
