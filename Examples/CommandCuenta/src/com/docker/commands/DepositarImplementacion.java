package com.docker.commands;

public class DepositarImplementacion implements InterfazOperacion{
	private Cuenta cuenta;
	private double monto;
	public DepositarImplementacion(Cuenta c, double m) {
		this.cuenta=c;
		this.monto=m;
	}
	@Override
	public void ejecutar() {
		this.cuenta.depositar(this.monto);
	}

}
