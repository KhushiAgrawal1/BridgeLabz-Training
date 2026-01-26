package com.regex;

import java.util.Scanner;

public class HexColorValidator {
	public static void main(String[] args) {
		System.out.println("Enter colour : ");
		Scanner sc = new Scanner(System.in);
		String colour = sc.nextLine();
		String regex = "^#[0-9A-Fa-f]{6}$";
		if(colour.matches(regex)) {
			System.out.println("Colour is valid hexcode!");
		}else {
			System.out.println("Colour is not a valid hexcode!");
		}		
	}
}
