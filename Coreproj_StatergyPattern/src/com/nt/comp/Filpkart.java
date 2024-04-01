package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Filpkart {
	//HAS-A PROPERTY
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	//b.method
	public String shopping(String items[],double prices[]) {
		//calcute bill ammout\
		double billAmount=0.0;
		for(double p:prices) {
			billAmount=billAmount+p;
		}
		int oid=new Random().nextInt(1000);
		//deliver the products
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"items with bill amount:::"+billAmount+"-----"+msg;
	}

}
