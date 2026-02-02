package com.Stream_API.Filtering_Expiring_Memberships;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class FilteringExpiringMemberships {
	public static void main(String[] args) {
		List<GymMember> list = Arrays.asList(
				new GymMember("Member1",LocalDate.now().plusDays(10)),
				new GymMember("Member2",LocalDate.now().plusDays(40)),
				new GymMember("Member3",LocalDate.now().plusDays(30)),
				new GymMember("Member4",LocalDate.now().minusDays(5)),
				new GymMember("Member5",LocalDate.now().plusDays(50))
				);
		LocalDate today = LocalDate.now();
		LocalDate after30Days = LocalDate.now().plusDays(30);
		
		List<GymMember> output = list.stream()
	    .filter(x -> 
		!x.expiryDate.isBefore(today)
		&&
		!x.expiryDate.isAfter(after30Days)
		)
		.collect(Collectors.toList());
	output.forEach(System.out::println);	
	}

}
