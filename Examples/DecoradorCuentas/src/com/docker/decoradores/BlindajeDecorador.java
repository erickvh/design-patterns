package com.docker.decoradores;

import com.docker.interfaces.InterfazCuenta;
import com.docker.modelo.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(InterfazCuenta cuentaDecorada) {
		//setea  la cuentaDecorada en el protected de la clase abstracta
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		//llama al metodo del cuenta decorada base  segun la implementacion de la interfaz
		this.cuentaDecorada.abrirCuenta(c);
		//agregado
		agregarBlindaje(c);
	}

	private void agregarBlindaje(Cuenta c) {
		System.out.println("Agregado blindaje a cuenta, cliente: "+c.getCliente());
	}
	

}
