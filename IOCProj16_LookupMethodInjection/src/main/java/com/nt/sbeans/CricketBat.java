package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("cBat")
public class CricketBat {
	
	 public CricketBat() {
		System.out.println("CricketBat.0-param Constructor::");
	}
	 
public int ScoreRuns() {
		return new Random().nextInt(100);
	}

}
