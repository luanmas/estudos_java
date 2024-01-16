package entities;

public class OrderItem {
	private Integer quantity;
	private Double price = 0.0; // preço do total do pedido
	private Product product;
	
	public OrderItem(){
	}
	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public Product getProduct() {
		return this.product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSubTotal() {
		return this.price += quantity * product.getPrice();
	}
}
