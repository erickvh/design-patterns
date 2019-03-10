package com.docker.implementacion;

import com.docker.interfaces.InterfazCuenta;
import com.docker.modelo.Cuenta;

public class CuentaAhorro implements InterfazCuenta {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("Se abrio una cuenta ahorro, cliente: "+c.getCliente());
	}

}
