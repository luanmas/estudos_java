package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.print("Enter the width and height measurements respectively : ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		System.out.printf("Area : %.4f\n", rec.area());
		System.out.printf("Perimeter : %.4f\n", rec.perimeter());
		System.out.printf("Diagonal : %.4f", rec.diagonal());
		
		sc.close();
	}

}
