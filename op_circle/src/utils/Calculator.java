package utils;

public class Calculator {
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return PI * Math.pow(radius, 2);
	}
	
	public static double volume(double radius) {
			return 4.0 * PI * Math.pow(radius, 3) / 3;
	}
}
