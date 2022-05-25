package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String nome;
	private double valorConta;
	
	//Construtores
	public ContaBancaria() {
	}
	public ContaBancaria(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	public ContaBancaria(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	//Geters e Seters 
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorConta() {
		return valorConta;
	}

	//Métodos
	public void deposito(double valor) {
		this.valorConta += valor;
	}
	public void saque(double valor) {
		this.valorConta -= valor + 5.00;
	}
	//ToString
	public String toString() {
		return "Account "
				+numeroConta+", "
				+"Holder: "
				+nome+", "
				+"Balance: $"
				+valorConta;
	}
}


