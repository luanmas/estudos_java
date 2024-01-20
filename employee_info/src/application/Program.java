package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage;
		
		Employee employee = new Employee();

		System.out.print("Enter your name : ");
		employee.name = sc.next();
		
		System.out.print("Enter your gross Salary : ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Enter your salary tax : ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee :" + employee.name + ", $" + employee.netSalary());
		
		System.out.print("Which percentage to increase salary : ");
		percentage = sc.nextDouble();
		System.out.println("Update data :" + employee.name + ", $" + employee.increaseSalary(percentage));
		
		sc.close();
	}

}
