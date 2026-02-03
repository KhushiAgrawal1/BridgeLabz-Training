package com.Collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String paragraph = "java stream api java stream collect java";
		  Map<String, Integer> wordCount =
	             Arrays.stream(paragraph.split(" "))      // Step 1
	                     .collect(Collectors.toMap(
	                              word -> word,          // key
	                              word -> 1,             // initial value
	                              Integer::sum           // merge duplicate keys
	                      ));

	        System.out.println(wordCount);
	}

}
