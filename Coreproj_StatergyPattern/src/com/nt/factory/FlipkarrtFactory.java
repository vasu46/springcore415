package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Filpkart;

public class FlipkarrtFactory {
	//static factory method having factory pattern logic
	public static Filpkart getInstance(String couriertype) {
		//cretae dependent class obj
		Courier courier=null;
		if(couriertype.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(couriertype.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier tyep");
		Filpkart fpkt=new Filpkart();
		fpkt.setCourier(courier);
		return fpkt;
	}

}
