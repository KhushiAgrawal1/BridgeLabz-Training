package com.Workshop;

public interface GeoUtils {
	static double calculateDistance(double a, double b) {
		return Math.abs(a-b) * 10;
	}

}
