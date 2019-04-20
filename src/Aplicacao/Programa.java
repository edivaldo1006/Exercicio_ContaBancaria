package Aplicacao;

import java.text.ParseException;
import java.util.Scanner;

import modelo.Conta;
import modelo.DomainException;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número da conta: ");
		System.out.println("Conta: ");
		int numero = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Valor Inicial: ");
		Double saldo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Limite de Saque: ");
		Double limiteSaque = sc.nextDouble();
		sc.nextLine();
		sc.nextLine();
		

		
		
		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
			
		System.out.println("Digite o valor que deseja sacar: ");
		Double valorSaque = sc.nextDouble();
			
			try {
				conta.saque(valorSaque);
				System.out.println("Novo Saldo: " + String.format("%.2f", conta.getSaldo()) );
			}
			catch (DomainException e) {
			System.out.println("Erro de Saque: " + e.getMessage());
		}
		
	
		
		sc.close();
	}
		
}

