package com.docker.commands;

public class RetirarImplementacion implements InterfazOperacion{

	private Cuenta cuenta;
	private double monto;
	
	public RetirarImplementacion(Cuenta c, double m) {
		this.cuenta=c;
		this.monto=m;
	}

	@Override
	public void ejecutar() {
		this.cuenta.retirar(monto);
	}

}
