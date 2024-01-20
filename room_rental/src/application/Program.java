package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented ? ");
		int numbersRented = sc.nextInt();
		Room[] rooms = new Room[10];

		for (int i = 0; i < numbersRented; i++) {
			System.out.printf("Rent #%d\n", i + 1);
			System.out.print("Name : ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Email : ");
			String email = sc.next();

			System.out.print("Room : ");
			int room = sc.nextInt();

			if (room > 10) {
				System.out.println("We have rooms up to number 10");
				System.out.print("Room : ");
				room = sc.nextInt();
			}

			rooms[room] = new Room(name, email, room);
		}

		System.out.println("Busy rooms:");

		// Mostra apenas os quartos alugados
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}

		sc.close();
	}

}
