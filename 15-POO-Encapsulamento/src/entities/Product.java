package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	//Construtores 
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Geters e Seters
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

	public int getQuantity() {
		return quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}
	
	//Métodos
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Produto: "+name+", $ "+ String.format("%.2f", price)+", Unidades: "+quantity+", Total: "+ String.format("%.2f",totalValueStock());
	}
}
