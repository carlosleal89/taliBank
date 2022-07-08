package taliBank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	
	public Conta(int agencia, int numeroConta) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		if (valor > 0) {
		this.saldo += valor;
		System.out.println("Depósito concluido. Seu saldo é de: "+this.saldo);
		} else {
			System.out.println("O valor precisa ser maior que zero.");
		}
	}
	
	public void saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque concluido. Seu saldo é de: "+this.saldo);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public boolean transfere(Conta contaDestino, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			contaDestino.saldo = valor; 
			System.out.println("Tranferencia concluida.");
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
