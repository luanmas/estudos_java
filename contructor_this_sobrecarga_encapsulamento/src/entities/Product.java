package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// O constructor é uma operação especial da classe que vai ser executado 
	// quando a classe for instânciada
	// construtor padrão
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// usando esse construtor personalizado , nos estamos sobrecarregando a variável quantity com 0	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units , Total : $"
				+ String.format("%.2f", totalValueInStock());
	}
}
