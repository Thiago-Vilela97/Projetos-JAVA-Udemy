package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n",areaX);
		System.out.printf("Triangulo Y area: %.4f%n",areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do triangulo X é maior");
		} else {
			System.out.println("A área do triangulo Y é maior");
		}
		sc.close();
	}

}
