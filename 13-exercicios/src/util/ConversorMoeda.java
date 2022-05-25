package util;

public class ConversorMoeda {

	public static final double IOF = 0.06;
	
	public static double valorPagamento(double preco, double quantidade) {
		double result = preco * quantidade;
		double result1 = result * IOF;
		return result + result1;
	}
	
}
