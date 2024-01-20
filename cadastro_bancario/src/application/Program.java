package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char hasInitialDeposit = sc.next().charAt(0);
		
		if(hasInitialDeposit == 'y') {
			
			System.out.print("Enter your initial value: ");
			double initialDeposit = sc.nextDouble();
			
			bank = new Bank(holder, numberAccount, initialDeposit);
		} else {
			bank = new Bank(holder, numberAccount);
		}
		
		System.out.println(bank);
		
		System.out.print("Do you want a deposit ? ");
		double newDeposit = sc.nextDouble();
		bank.makeDeposit(newDeposit);
		
		System.out.print("Update your bank account : \n");
		System.out.println(bank);
		
		System.out.print("Do you want to make a withdrawal ? ");
		double withdrawValue = sc.nextDouble();
		bank.withdrawValue(withdrawValue);
		
		System.out.print("Update your bank account : \n");
		System.out.println(bank);
		
		System.out.print("Update your bank account : \n");
		System.out.println(bank);
		
		
		sc.close();
	}

}
