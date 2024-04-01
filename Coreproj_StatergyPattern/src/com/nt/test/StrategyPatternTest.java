package com.nt.test;

import com.nt.comp.Filpkart;
import com.nt.factory.FlipkarrtFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		//use Factory pattern to target class obj
		Filpkart fpkt=FlipkarrtFactory.getInstance("dtdc");
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"},new double[] {5000.0,6000.0});
		System.out.println(resultMsg);
	}

}
