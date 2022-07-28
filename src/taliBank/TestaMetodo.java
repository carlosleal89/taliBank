package taliBank;

import java.util.Scanner;

public class TestaMetodo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		Scanner operacao = new Scanner(System.in);
		Scanner conta = new Scanner(System.in);
		Scanner trans = new Scanner(System.in);
		
		Conta contaCarlos = new Conta(666, 1001);
		Conta contaPompom = new Conta(666, 1002);
		Conta contaMaria = new Conta(666, 1003);
		Cliente carlos = new Cliente("Carlos Leal", "018.286.540.19", "Rua do ceu", "14/06/1989");
		Cliente pompom = new Cliente("Pompom","666.666.666.66","Rua do ceu", "14/06/2014");
		Cliente maria = new Cliente("Maria Leite","022.066.066.69","Rua do ceu", "09/01/1991");
		contaCarlos.setTitular(carlos);
		contaPompom.setTitular(pompom);
		contaMaria.setTitular(maria);
		
		String [] listaClientes = {carlos.getNome(), pompom.getNome(), maria.getNome()}; 
		
		boolean opcaoConta = true;
		boolean opcaoOperacao = true;		
		while (opcaoConta) {
			System.out.println("Escolha a conta que deseja acessar: ");
			int titular = 1;
			for (int i = 0; i<listaClientes.length; i++ ) {
				System.out.println(titular+" - "+listaClientes[i]);
				titular++;
			}
			int contaEscolhida = conta.nextInt();
			Conta titularConta = contaCarlos;
			
			if (contaEscolhida == 1) {
				titularConta = contaCarlos;
				System.out.println("Bem vindo(a), "+titularConta.getTitular().getNome()+"."+" O numero de sua conta é: "+titularConta.getNumeroConta());
			}
			if (contaEscolhida == 2) {
				titularConta = contaPompom;
				System.out.println("Bem vindo(a), "+titularConta.getTitular().getNome()+"."+" O numero de sua conta é: "+titularConta.getNumeroConta());
			}
			if (contaEscolhida == 3) {
				titularConta = contaMaria;
				System.out.println("Bem vindo(a), "+titularConta.getTitular().getNome()+"."+" O numero de sua conta é: "+titularConta.getNumeroConta());
			}
			
			while (opcaoOperacao) {
				System.out.println("Selecione a operação desejada: 1 - Deposito, 2 - Saque, 3 - Transferência, 4 - Saldo, 5 - SAIR");
				int op = operacao.nextInt();
				if (op == 1) {
					System.out.println("Digite o valor para depósito: ");		
					titularConta.deposita(valor.nextDouble());
				}
				if (op == 2) {
					System.out.println("Digite o valor para saque: ");
					titularConta.saca(valor.nextDouble());
				}
				if (op == 3) {
					System.out.println("Digite o valor da transferencia: ");
					double valorTransferir = valor.nextDouble();
					System.out.println("Escolha a conta para transferir: ");
					int listaTransferencia = 1;
					for (int i = 0; i<listaClientes.length; i++ ) {
						System.out.println(listaTransferencia+" - "+listaClientes[i]);
						listaTransferencia++;
					}
					int contaTransferir = trans.nextInt();
					Conta transferirConta = contaCarlos;
					if (contaTransferir == contaEscolhida) {
						System.out.println("Voce deve escolher uma conta diferente da sua! ");
					} else if (contaTransferir == 1) {
						titularConta.transfere(transferirConta, valorTransferir);
					} else if (contaTransferir == 2) {
						transferirConta = contaPompom;
						titularConta.transfere(transferirConta, valorTransferir);
					} else if (contaTransferir == 3) {
						transferirConta = contaMaria;
						titularConta.transfere(transferirConta, valorTransferir);
					} 
				}	
				if (op == 4) {
					System.out.println("Seu saldo é de: "+titularConta.getSaldo());
				}
				if (op == 5) {
					System.out.println("Obrigado !");
					return;
				}
			
				
			}
			return;
		}
		
	}

}
