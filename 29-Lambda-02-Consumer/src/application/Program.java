package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Usando implementa��o de Interface
		list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
		System.out.println("********************************");
		
		//usando Reference Method COM metodo est�tico
		list.forEach(Product::staticPriceUpdate);
		
		list.forEach(System.out::println);
		System.out.println("********************************");
		
		//usando Reference Method COM metodo N�O est�tico
		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(System.out::println);
		System.out.println("********************************");
		
		//usando a fun��o LAMDA declarada
		double factor = 1.1;
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice()*factor);
		};
		
		list.forEach(cons);
		
		list.forEach(System.out::println);
		System.out.println("********************************");
		
		//usando a fun��o LAMDA INLINE
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		
		list.forEach(System.out::println);
		System.out.println("********************************");
	}

}
