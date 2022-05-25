package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Product product = new Product();
	
	System.out.println("Entre com os dados do produto: ");
	
	System.out.print("Name: ");
	product.name = sc.nextLine();
	
	System.out.print("Preço: ");
	product.price = sc.nextDouble();
	
	System.out.print("Quantidade em estoque: ");
	product.quantity = sc.nextInt();
	System.out.println();
	
	System.out.println(product);
	System.out.println();
	
	System.out.print("Entre com uma quantidade a ser adicionada em estoque: ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);
	
	System.out.println();
	System.out.println(product);
	
	System.out.println();
	System.out.print("Entre com uma quantidade a ser removida do estoque: ");
	quantity = sc.nextInt();
	product.removeProducts(quantity);
	
	System.out.println();
	System.out.println(product);
	sc.close();

	}

}
