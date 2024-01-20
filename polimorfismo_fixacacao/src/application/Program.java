package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of product: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.print("Commom, used or imported (c/u/d)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch (ch) {
			case 'i':
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
				break;
			case 'c':
				list.add(new Product(name, price));
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
				break;
			default:
				list.add(new Product(name, price));
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
