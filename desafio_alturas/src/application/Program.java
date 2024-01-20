package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be entered ? ");
		System.out.print("");
		int quantityPeople = sc.nextInt();
		sc.nextLine();
		Person[] people = new Person[quantityPeople];

		for (int i = 0; i < people.length; i++) {
			System.out.printf("%dst person data\n", i + 1);
			System.out.print("Name : ");
			String name = sc.next();

			System.out.println("Age : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Height : ");
			double height = sc.nextDouble();

			people[i] = new Person(name, age, height);
			System.out.println();
		}

		double sum = 0.0;
		for (int i = 0; i < people.length; i++) {
			sum += people[i].getHeight();
		}

		System.out.println("Average height : " + sum / people.length);

		System.out.println("People under 16 : ");
		int underSixteen = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) {
				underSixteen++;
				System.out.println(people[i].getName());
			}
		}
		System.out.printf("Percentage : %.1f%%", (underSixteen * 100.0) / people.length);

		sc.close();
	}

}
