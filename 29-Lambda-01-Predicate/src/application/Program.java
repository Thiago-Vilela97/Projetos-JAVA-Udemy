package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Pen Drive", 86.90));
		
		//Usar predicate com outra classe implementando a interface
		list.removeIf(new ProductPredicate());
		
		//Usar a predicate dentro de outra classe - reference Method com metodo estatico
		list.removeIf(Product::staticProductPredicate);
		
		//Usar a predicate dentro de outra classe - reference Method com metodo NÂO estatico
		list.removeIf(Product::nomStaticProductPredicate);
		
		//referencia lambda declarada
		double min = 100.0;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);
		
		//expressão lambda INLINE
		list.removeIf(p -> p.getPrice() >= min);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
