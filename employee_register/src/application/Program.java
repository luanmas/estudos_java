package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered ? ");
		int employeeNumber = sc.nextInt();

		List<Employee> listEmployee = new ArrayList<>();

		for (int i = 1; i <= employeeNumber; i++) {
			System.out.println("Employee #" + i);

			System.out.print("Id : ");
			int employeeId = sc.nextInt();
			sc.nextLine();

			System.out.print("Name : ");
			String name = sc.nextLine();

			System.out.print("Salary : ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(employeeId, name, salary);

			listEmployee.add(employee);
		}

		System.out.print("Enter the employee id that will be have salary increase: ");
		int employeeIdIncreaseSalary = sc.nextInt();

		Employee emp = listEmployee.stream().filter(employee -> employee.getId() == employeeIdIncreaseSalary)
				.findFirst().orElse(null);

		if (emp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();

			emp.salaryIncrease(percentage);
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println("List of employees :");
		for (Employee employee : listEmployee) {
			System.out.println(employee);
		}

		sc.close();
	}

}
