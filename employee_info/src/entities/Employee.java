package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary () {
		return grossSalary - tax;
	}
	
	public double increaseSalary (double percentage) {
		percentage /= 100;
		return this.grossSalary * percentage + this.netSalary();
	}
}
