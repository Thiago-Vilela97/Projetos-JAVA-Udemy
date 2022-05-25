import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int quantidadeLinhas = sc.nextInt();
		
		for(int i=1; i <= quantidadeLinhas; i++) {
			int resultQuadrado = (int) Math.pow(i, 2);
			int resultCubo = (int) Math.pow(i, 3);
			System.out.print(i+" ");
			System.out.print(resultQuadrado+" ");
			System.out.println(resultCubo);
		}
		
		sc.close();
		
	}

}
