package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("How many person ? ");
		int n = sc.nextInt();
		
		double[] height = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("How tall is this person?");
			height[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
				
		for (int i = 0; i < n; i++) {
			sum += height[i];
		}
		
		double avg = sum / n;
		
		System.out.println("Average height : " + avg);
		
		sc.close();
	}

}
