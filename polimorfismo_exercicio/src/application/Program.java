package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.OutsourcedEmployee;
import entities.employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced: ");
			char choice = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(choice == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				employee employeeOutsourced = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(employeeOutsourced);
			} else {
				employee employee = new employee(name, hours, valuePerHour);
				list.add(employee);				
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(employee emp: list) {
			System.out.print(emp.getName() + " - " + "$ " + emp.payment() + "\n");
		}
		
		sc.close();
	}

}
