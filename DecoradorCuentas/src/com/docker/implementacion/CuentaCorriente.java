package com.docker.implementacion;

import com.docker.interfaces.InterfazCuenta;
import com.docker.modelo.Cuenta;

public class CuentaCorriente implements InterfazCuenta{

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("Se abro una cuenta corriente, cliente: "+c.getCliente());
	}

}
