package taliBank;

import java.util.Scanner;

public class TestaMetodo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		Scanner operacao = new Scanner(System.in);
		
		Conta carlos = new Conta();
		Conta pompom = new Conta();
		carlos.titular = new Cliente();
		carlos.titular.setNome("Carlos");
		carlos.titular.setCpf("018.268.540.19");
		System.out.println(carlos.titular.getNome()+" "+carlos.titular.getCpf());
		
		boolean opcao = true;
		
		while (opcao) {
			System.out.println("Selecione a operação desejada: 1 - Deposito, 2 - Saque, 3 - Transferência, 4 - Saldo, 5 - SAIR");
			int op = operacao.nextInt();
			if (op == 1) {
				System.out.println("Digite o valor para depósito: ");		
				carlos.deposita(valor.nextDouble());
			}
			if (op == 2) {
				System.out.println("Digite o valor para saque:");
				carlos.saca(valor.nextDouble());
			}
			if (op == 3) {
				System.out.println("Digite o valor da transferencia: ");
				carlos.transfere(pompom, valor.nextDouble());
				}
			if (op == 4) {
				System.out.println("Seu saldo é de: "+carlos.getSaldo());
			}
			if (op == 5) {
				System.out.println("Obrigado!");
				return;
			}
		
			
		}
	}

}
