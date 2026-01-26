package com.regex;

public class LicensePlateValidator {
	public static void main(String[] args) {
		String[] numberPlates = {"AB1234","A12345","ab1234","XY9999","AB12"};
	    String regex = "^[A-Z]{2}[0-9]{4}$";
	    for(String number : numberPlates ) {
	    	if(number.matches(regex)) {
	    		System.out.println(number + " → Valid");
	    	}else {
	    		System.out.println(number + " → Not Valid");
	    	}
	    }
	}    
}
