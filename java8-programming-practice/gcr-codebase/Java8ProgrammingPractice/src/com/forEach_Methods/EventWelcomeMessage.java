package com.forEach_Methods;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMessage {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Khushi", "Tanisha", "Naman");
		list.stream().forEach(name ->
		System.out.println("Welcome : " + name)
		);
	}
}
