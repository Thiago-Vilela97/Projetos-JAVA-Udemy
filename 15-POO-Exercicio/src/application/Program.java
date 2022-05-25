package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria newUser;
		
		System.out.print("Enter account numer: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			newUser = new ContaBancaria(numeroConta, name,initialValue);
	
		} else {
			newUser = new ContaBancaria(numeroConta, name);
		}
		
		System.out.println("Account data:");
		System.out.println(newUser);
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		newUser.deposito(deposito);
		System.out.println("Update account data: ");
		System.out.println(newUser);
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		newUser.saque(saque);
		System.out.println("Update account data: ");
		System.out.println(newUser);
		


		sc.close();
	}

}
