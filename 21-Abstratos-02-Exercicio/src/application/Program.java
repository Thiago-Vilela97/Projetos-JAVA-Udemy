package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax Payer: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name,anualIncome,healthExpenditures));
			} else if (c == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name,anualIncome,numberOfEmployees));
			} else {
				System.out.println("Entrada inválida");
			}		
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		Double soma = 0.0;
		for(TaxPayer p : list ) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.tax()));
			soma += p.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", soma));
		
		sc.close();
	}

}
