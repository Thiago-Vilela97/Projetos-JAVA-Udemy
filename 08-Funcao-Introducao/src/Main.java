import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();

	}
	
	public static int max(int n1,int n2,int n3) {
		int aux;
		if (n1 > n2 && n1 > n3) {
			aux = n1;
		}
		else if (n2 > n3) {
			aux = n2;
		}
		else {
			aux = n3;
		}
		return aux;
	}
	
	public static void showResult(int valor) {
		System.out.println("O maio valor é: "+valor);
	}

}
