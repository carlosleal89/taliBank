package taliBank;

import java.util.Scanner;

public class TestaMetodo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		Scanner operacao = new Scanner(System.in);
		
		Conta contaCarlos = new Conta(666, 1001);
		Conta contaPompom = new Conta(666, 1002);
		Cliente carlos = new Cliente("Carlos Leal", "018.286.540.19", "Rua do ceu", "14/06/1989");
		contaCarlos.setTitular(carlos);
		
		System.out.println(contaCarlos.getTitular().getNome()+" "+contaCarlos.getTitular().getCpf());
		
		boolean opcao = true;
		
		while (opcao) {
			System.out.println("Selecione a operação desejada: 1 - Deposito, 2 - Saque, 3 - Transferência, 4 - Saldo, 5 - SAIR");
			int op = operacao.nextInt();
			if (op == 1) {
				System.out.println("Digite o valor para depósito: ");		
				contaCarlos.deposita(valor.nextDouble());
			}
			if (op == 2) {
				System.out.println("Digite o valor para saque:");
				contaCarlos.saca(valor.nextDouble());
			}
			if (op == 3) {
				System.out.println("Digite o valor da transferencia: ");
				contaCarlos.transfere(contaPompom, valor.nextDouble());
				}
			if (op == 4) {
				System.out.println("Seu saldo é de: "+contaCarlos.getSaldo());
			}
			if (op == 5) {
				System.out.println("Obrigado!");
				return;
			}
		
			
		}
	}

}
