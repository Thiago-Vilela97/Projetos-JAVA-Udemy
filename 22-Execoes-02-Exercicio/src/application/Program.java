package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withDrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder,initialBalance,withDrawLimit);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		account.withDraw(amount);
		
		System.out.println(account);
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Format number account invalid!");
		}
		
		sc.close();
	}

}
