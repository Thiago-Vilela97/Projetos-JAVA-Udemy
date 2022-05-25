package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio: ");
		
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferecia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", Calculator.PI);
		
		sc.close();

	}


}
