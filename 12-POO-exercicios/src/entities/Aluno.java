package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 +nota3;
	}
	
	public double pontosFaltantes() {
		if(notaTotal() > 60) {
			return 0.0;
		} else {
			return 60 - notaTotal();
		}
	}
	
	public String toString() {
		return "Final Grade = "+String.format("%.2f", notaTotal());
	}
}
