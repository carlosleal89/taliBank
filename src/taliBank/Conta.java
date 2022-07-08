package taliBank;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depósito concluido. Seu saldo é de: "+this.saldo);
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
}
