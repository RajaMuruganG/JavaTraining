package com.oops.methodRef;

public class Games {

	String[] getNameType(String type) {
			
		if(type.equals("in")) {
			return new String[] {"carrom","chess"};
		}else {
			return new String[] {"cricket","football"};
		}
		
	}
}
