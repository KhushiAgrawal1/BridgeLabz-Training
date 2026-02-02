package com.Stream_API.Filtering_Expiring_Memberships;

import java.time.LocalDate;

public class GymMember {
	String name;
	LocalDate expiryDate;
	public GymMember(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String toString() {
		return "name : " + name + " expiry date : " + expiryDate;				
	}

}
