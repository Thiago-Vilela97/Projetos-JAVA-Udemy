package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno alex = new Aluno();
		System.out.println("Entre com o nome do Aluno e suas 3 notas: ");
		alex.nome = sc.nextLine();
		alex.nota1 = sc.nextDouble();
		alex.nota2 = sc.nextDouble();
		alex.nota3 = sc.nextDouble();
		
		System.out.println(alex);

		if(alex.pontosFaltantes() > 0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", alex.pontosFaltantes());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
