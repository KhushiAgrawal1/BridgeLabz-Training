package com.Stream_API.Transforming_Names_for_Display;

import java.util.*;
import java.util.stream.Collectors;

public class TransformingNamesforDisplay {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Khushi", "Tanisha", "Naman");
		list.stream().map(n -> n.toUpperCase()).sorted().forEach(System.out::println);	
	}
}
