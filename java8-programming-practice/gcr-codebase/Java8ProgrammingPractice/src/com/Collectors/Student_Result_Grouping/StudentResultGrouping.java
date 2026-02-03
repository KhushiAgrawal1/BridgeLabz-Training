package com.Collectors.Student_Result_Grouping;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class StudentResultGrouping {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("x","A"),
				new Student("y","B"),
				new Student("z","A"),
				new Student("xx","B"),
				new Student("xy","A"),
				new Student("xz","C")
				);
		
		Map<String,List<String>> output = list.stream()
				
	 .collect(Collectors.groupingBy(Student :: getGrade,Collectors.mapping(Student :: getName, Collectors.toList())
	    ));
		
	    output.forEach((grade,names) ->
	    	System.out.println(grade + " : " + names)
	    );    
	}
}
