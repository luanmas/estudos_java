package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;

	private static final SimpleDateFormat momentFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private List<OrderItem> order = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void addOrdemItem(OrderItem order) {
		this.order.add(order);
	}

	public void removeOrdemItem(OrderItem order) {
		this.order.remove(order);
	}

	public Double totalValue() {
		Double totalValue = 0.0;
		for (OrderItem item : order) {
			totalValue += item.getProduct().getPrice() * item.getQuantity();
		}

		return totalValue;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order Moment: " + momentFormat.format(this.moment) + "\n");
		sb.append("Order Status: " + this.status + "\n");
		sb.append("Client: " + this.client.getName() + " " + birthDateFormat.format(this.client.getBirthDate()) + " - " + this.client.getEmail() + "\n");
		sb.append("Order Items: \n");
		for (OrderItem item : order) {
			sb.append(item.getProduct().getName() + ", ");
			sb.append("$" + item.getProduct().getPrice() + ", ");
			sb.append("Quantity: " + item.getQuantity() + ", ");
			sb.append("Subtotal: $" + item.getSubTotal() + "\n");
		}
		sb.append("Total price: $" + this.totalValue());

		return sb.toString();
	}
}
