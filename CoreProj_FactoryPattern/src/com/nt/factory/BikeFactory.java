package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectrickiBike;
import com.nt.comps.SportsBike;
import com.nt.comps.StandardBike;

public class BikeFactory {
	public static Bike orderBike(String type) {
		Bike bike=null;
		if(type.equalsIgnoreCase("standard"))
			bike=new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike=new SportsBike();
		else if(type.equalsIgnoreCase("electricki"))
			bike=new ElectrickiBike();
		else if(type.equalsIgnoreCase("Bullet"))
			bike=new BulletBike();
		else
			throw new IllegalArgumentException("Invalid Bike Type");
		
		return bike;
		
	}

}
