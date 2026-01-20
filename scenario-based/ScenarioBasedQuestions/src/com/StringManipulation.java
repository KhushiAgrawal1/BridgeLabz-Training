package com;
import java.util.*;

public class StringManipulation {

    public static String CleanseAndInvert(String input) {
    	if(input == null || input.length()<6) {
    		return "";
    	}
    	for(int i=0; i<input.length(); i++){
    		char c = input.charAt(i);
    		if(!Character.isLetter(c)) {
    			return "";
    		}
    	}
    	StringBuilder result = new StringBuilder();
    	input = input.toLowerCase();
    	for(int j=0; j<input.length(); j++){
    		char ch = input.charAt(j);
    		if((int)ch % 2 != 0){
    			  result.append(ch);		
    		}
    	}
    	result = result.reverse();
    	StringBuilder key = new StringBuilder();
    	for(int j=0; j<result.length(); j++){
    		char ch = result.charAt(j);
    		if((int)ch % 2 == 0){
    			  key.append(Character.toUpperCase(ch));		
    		}
    		else {
    			key.append(ch);
    		}
    	}
    	return key.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();
        String output = CleanseAndInvert(input);
        if(output.isEmpty()) {
        	System.out.println("Invalid Input!");
        }
        else {
        	System.out.println("The generated key is: "+ output);
        }     

    }
}
