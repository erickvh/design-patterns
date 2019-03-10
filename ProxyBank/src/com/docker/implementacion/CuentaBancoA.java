package com.docker.implementacion;

import com.docker.interfaces.InterfaceCuenta;
import com.docker.model.Cuenta;

public class CuentaBancoA implements InterfaceCuenta{

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoInicial()-monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo Actual: "+cuenta.getSaldoInicial());
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual= cuenta.getSaldoInicial()+monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo Actual: "+cuenta.getSaldoInicial());
		return cuenta;

	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo Actual: "+cuenta.getSaldoInicial());
	}

}
