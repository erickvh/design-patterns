package com.docker.commands;

//request
public class Cuenta {
	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo) {
		this.id=id;
		this.saldo=saldo;
	}
	
	public void retirar(double monto) {
		this.saldo=this.saldo-monto;
		System.out.println("[Comando retirar]=> cuenta: "+this.id+" saldo: "+this.saldo);
	}

	public void depositar(double monto) {
		this.saldo=this.saldo+monto;
		System.out.println("[Comando depositar]=> cuenta: "+this.id+" saldo: "+this.saldo);
	}
}
