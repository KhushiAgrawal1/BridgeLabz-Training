package com.Stream_API.Hospital_Doctor_Availability;

import java.util.*;
import java.util.stream.Collectors;

public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> list = Arrays.asList(
				new Doctor("Doctor1", "Speciality1",true),
				new Doctor("Doctor2", "Speciality2",true),
				new Doctor("Doctor3", "Speciality1",false),
				new Doctor("Doctor2", "Speciality2",false),
				new Doctor("Doctor1", "Speciality1",true)
				);						
	  List<Doctor> weekendDoctorList = list.stream().filter(d -> d.availableOnWeekend)
			  .sorted(Comparator.comparing(d -> d.speciality)).collect(Collectors.toList());
	
	weekendDoctorList.forEach(System.out::println);
}
}

