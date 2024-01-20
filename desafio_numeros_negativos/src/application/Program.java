package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many number you want type ? ");
		int quantityNumbers = sc.nextInt();
		sc.nextLine();
		
		int[] numbers = new int[quantityNumbers];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Type a number :");
			numbers[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("Negative numbers : ");
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.printf("%d\n" , numbers[i]);
			}
		}
		
		sc.close();
	}

}
