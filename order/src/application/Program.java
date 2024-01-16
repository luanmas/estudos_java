package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();

		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		
		Date currentDate = new Date();

		Order order = new Order(currentDate, OrderStatus.valueOf(status), client);
		for (int i = 1; i <= quantity; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			sc.nextLine();
			System.out.print("Product name: ");
			String prod_name = sc.nextLine();
			
			System.out.print("Product price: ");
			Double prod_price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int prod_quantity = sc.nextInt();

			Product product = new Product(prod_name, prod_price);
			OrderItem orderItem = new OrderItem(prod_quantity, product);
			
			order.addOrdemItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order.toString());
		sc.close();
	}

}
