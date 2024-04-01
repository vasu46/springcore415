package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier {
	@Override
	public 	String deliver(int oid) {
		return oid+"order items are kept for deliver by dtdc";
		
		
	}
	

}
