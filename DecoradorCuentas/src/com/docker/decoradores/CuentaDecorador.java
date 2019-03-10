package com.docker.decoradores;

import com.docker.interfaces.InterfazCuenta;
import com.docker.modelo.Cuenta;

public abstract class CuentaDecorador implements InterfazCuenta {
	protected InterfazCuenta cuentaDecorada;
	//recibir cualquier implementacion de la interfaz cuenta
	public CuentaDecorador(InterfazCuenta c) {
		this.cuentaDecorada= c;
	}
	
	//utiliza implementacion para hacer uso de la implementacion, su comportamiento
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}
}
