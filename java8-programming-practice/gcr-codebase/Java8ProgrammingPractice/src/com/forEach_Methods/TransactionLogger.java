package com.forEach_Methods;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TransactionLogger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1215525, 254545, 545451541, 454545);
		list.forEach(id -> 
			System.out.println(id + " : " + LocalDate.now())
	  );						
	}

}
