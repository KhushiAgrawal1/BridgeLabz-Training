package com.forEach_Methods;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"agrawalkhushi267@gmail.com",
				"khushiagrawal2505@gmail.com",
				"prachisolarservices@gmail.com"								
				);
		list.forEach(email -> sendEmailNotification(email));	
	}
	static void sendEmailNotification(String email) {
		System.out.println("Email notification : " + email);
	}

}
