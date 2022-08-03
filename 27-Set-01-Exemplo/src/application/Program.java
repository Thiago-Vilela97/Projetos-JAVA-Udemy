package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		Set<String> set2 = new TreeSet<>();
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("PC");
		set.add("Relogio");
		
		
		set2.add("TV");
		set2.add("Tablet");
		set2.add("Notebook");
		
		set3.add("TV");
		set3.add("Tablet");
		set3.add("Notebook");

		// É o mais rápido, mas não respeita a ordem
		System.out.println("HashSet: ");
		System.out.println(set.contains("Notebook"));
		
		set.remove("PC");
		
		set.removeIf(x -> x.length()>= 3);
		
		for (String p : set) {
			System.out.println(p);

		}
		
		System.out.println("******************************");
		// Coloca em ordem Alfabetica
		System.out.println("TreeSet: ");
		System.out.println(set2.contains("Notebook"));
		
		for (String p : set2) {
			System.out.println(p);

		}
		
		System.out.println("******************************");
		// Mantem a ordem que foram inseridos
		System.out.println("LinkedHashSet: ");
		System.out.println(set3.contains("Notebook"));
		
		for (String p : set3) {
			System.out.println(p);

		}

	}

}
