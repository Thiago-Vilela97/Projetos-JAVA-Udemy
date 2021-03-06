package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
				
		
		//Instaciar um novo pedido do cliente acima (moment e status)
		Date moment = new Date();
		String status = "PROCESSING";
		
		Order order = new Order(moment, OrderStatus.valueOf(status), new Client(name,email,birthDate));

	
		System.out.print("How many items to this order? ");
		int quantityItem = sc.nextInt();
		
		for(int i = 1; i<=quantityItem; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity,productPrice, new Product(productName,productPrice));
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: "+ sdf1.format(moment) );
		System.out.println("Order Status: "+status);
		System.out.println(order);
		
		
		sc.close();
	}

}
