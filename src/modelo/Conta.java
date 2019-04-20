package modelo;

import modelo.DomainException;

public class Conta {

	Integer numero;
	String titular;
	Double saldo;
	Double limiteSaque;
	
	
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}
	
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposit(Double valor) {
		saldo += valor;
	}
	
	public void saque(Double valor) {
		if (valor > limiteSaque) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (valor > saldo) {
			throw new DomainException("Not enough balance");
		}
		
		saldo -= valor;
		
	}
	
}
