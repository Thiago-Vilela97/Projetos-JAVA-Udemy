package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Qual a cota��o do Dolar? ");
		double cotacao = sc.nextDouble();
		
		System.out.print("Quantos D�lares deseja comprar? ");
		double comprar = sc.nextDouble();
		
		System.out.printf("Voc� pagara em Reais = %.2f%n", ConversorMoeda.valorPagamento(cotacao, comprar));
		
		sc.close();

	}

}
