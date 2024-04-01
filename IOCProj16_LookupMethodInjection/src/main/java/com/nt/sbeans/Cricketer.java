package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer {
	
	@Lookup
	public abstract  CricketBat getBat();
	
	public String batting() {
		//getDEPENDENT CALSS 
		CricketBat bat=getBat();
		int result=bat.ScoreRuns();
		return "batsMan runs is::"+bat.ScoreRuns();
	}
	public String bowling() {
		return "Cricketer is bowling";
		
	}
	public String wicketKeepin() {
		return "Cricketer is wicketKeeping";
	}
	public String fileding() {
		return "Cricketer is fielding the ball";
		}

}
