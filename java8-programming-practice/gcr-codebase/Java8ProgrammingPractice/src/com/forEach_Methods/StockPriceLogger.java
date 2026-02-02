package com.forEach_Methods;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(232.25512, 2523.5, 26325656.55, 62556.151);
		list.stream().forEach(prize ->
		 System.out.println("Live stock price : " + prize)
		 );
	}
}
