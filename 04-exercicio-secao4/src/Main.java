import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int soma = A + B;
		
		System.out.println("SOMA = "+soma);
		
		//2
		
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double calcularRaio = pi * Math.pow(raio, 2);
			
		System.out.printf("Area = %.4f %n", calcularRaio);
		
		// 4
		
		int number = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salary = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f %n", salary);
		
		// Sempre lembrar de finalizar o sc
		
		sc.close();
	}

}
