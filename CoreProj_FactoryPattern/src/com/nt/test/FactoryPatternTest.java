package com.nt.test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bike bike=BikeFactory.orderBike("standard");
		 bike.drive();
		 System.out.println("=====================");
		 Bike bike1=BikeFactory.orderBike("Bullet");
		 bike1.drive();
		 System.out.println("=====================");
		 Bike bike2=BikeFactory.orderBike("SpOrtS");
		 bike2.drive();
		 System.out.println("=====================");
		 Bike bike3=BikeFactory.orderBike("ELECTRICKI");
		 bike3.drive();
		 

	}

}
