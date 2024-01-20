package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1000, "Luan", 0.0);
		BusinessAcount bacc = new BusinessAcount(1001, "Pedro", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(3000, "Ana", 0.0, 300.0);
		Account acc3 = new SavingsAccount(2000, "LUIS", 100.0, 0.1);
		
		// DOWNCASTING
		//Utilizando o instanceof para criar uma melhor segurança
		if (acc3 instanceof BusinessAcount) {
			BusinessAcount bacc1 = (BusinessAcount) acc2;
			bacc1.deposit(10.0);
			System.out.println("DEPOSITED");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount sacc1 = (SavingsAccount) acc3;
			sacc1.updateBalance();
			System.out.println("UPDATE");
		}
	
	}

}
