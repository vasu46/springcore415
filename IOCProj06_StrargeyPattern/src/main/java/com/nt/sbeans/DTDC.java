package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DTDC implements ICourier {

	@Override
	public String deliver(int oid) {
		
		return oid+"orders are deliverd by dtdc courier:";
	}

}
