package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		//TreeMap vai ordenar por ordem alfabetica o String
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "99719122");
		
		cookies.remove("email");
		cookies.put("phone", "123123");
		
		System.out.println("Contains 'phone' key" + cookies.containsKey("phone"));
		System.out.println("Phone number: "+ cookies.get("phone"));
		System.out.println("Email: "+ cookies.get("email"));
		System.out.println("Syze: " + cookies.size());
		
		System.out.println("ALL cookies: ");
		for (String key: cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
		

	}

}
