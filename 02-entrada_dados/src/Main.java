import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * int y; char x;
		 * 
		 * x = sc.next().charAt(0); y = sc.nextInt();
		 * 
		 * System.out.println("Voce digitou: "+y); System.out.println(x);
		 */

		String s1, s2, s3;
		int x;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}
