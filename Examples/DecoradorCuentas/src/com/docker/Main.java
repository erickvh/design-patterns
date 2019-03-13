package com.docker;

import com.docker.decoradores.BlindajeDecorador;
import com.docker.implementacion.CuentaAhorro;
import com.docker.interfaces.InterfazCuenta;
import com.docker.modelo.Cuenta;

public class Main {

	public static void main(String[] args) {
		Cuenta c= new Cuenta(22,"Erick Shazam");
		InterfazCuenta cuenta= new CuentaAhorro();
		InterfazCuenta cuentaBlindada = new BlindajeDecorador(cuenta);
		cuentaBlindada.abrirCuenta(c);
	}

}
