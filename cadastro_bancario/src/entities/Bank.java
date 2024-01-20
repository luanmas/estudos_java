package entities;

public class Bank {
	// Esses atributos são visiveis apenas a essa classe
	private String name;
	private int numberAccount;
	private double balance;
	
	// Construtor padrão
	public Bank (String name, int numberAccount, double initialDeposit) {
		this.name = name;
		this.numberAccount = numberAccount;
		this.balance = initialDeposit;
	}
	
	// Construtor Personalizado
	public Bank (String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}
	
	
	// Encapsulamento
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void makeDeposit(double value) {
		this.balance += value;
	}
	
	public void withdrawValue(double value) {
		value += 5.00;
		this.balance -= value;
	}
	
	
	

	// Adaptando o metodo toString(
	public String toString() {
		return "Holder : " 
		+ this.name 
		+ "\n" + "Number Account : " 
		+ this.numberAccount + "\n" 
		+ "Balance : " 
		+ this.balance;
	}
}
