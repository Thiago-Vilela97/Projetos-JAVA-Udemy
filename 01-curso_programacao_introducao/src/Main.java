import java.util.Locale;

public class Main {

	public static void main(String[] args) {

			
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("O resultado é= "+x+" Metros");
		System.out.printf("Resultado = %.2f Metros %n", x);
		
		System.out.printf("%s tem %d anos e ganha %.2f reais por dia trabalhado %n", nome, y, x);
	}

}
