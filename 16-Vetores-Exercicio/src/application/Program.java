package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Locacao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Locacao[] locacao = new Locacao[10];

		
		
		for(int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			locacao[quarto] = new Locacao(name, email, quarto);
		}
		
		System.out.println();
		System.out.println("Busy Rooms: ");
		
		for (int i = 0; i < locacao.length; i++) {
			if(locacao[i]!=null) {
				System.out.println(locacao[i].getRoom()
						+": "
						+locacao[i].getName()
						+", "
						+locacao[i].getEmail());
			}
		}
		
		
		
		sc.close();
	}

}
