package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alumn;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Alumn alumn = new Alumn();
		
		System.out.print("Enter your name : ");
		alumn.name = sc.next();
		
		System.out.print("Enter your first note : ");
		alumn.first_note = sc.nextDouble();
		
		System.out.print("Enter your second note : ");
		alumn.second_note = sc.nextDouble();

		System.out.print("Enter your third note : ");
		alumn.third_note = sc.nextDouble();
		
		System.out.println("FINAL GRADE : " + alumn.final_grade());
		System.out.println(alumn.isPassed());
		
		sc.close();
	}

}
