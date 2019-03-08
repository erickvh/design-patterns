package com.docker.implementaciones;

import com.docker.interfaces.ConexionBD;

public class ConexionVacia implements ConexionBD {

	@Override
	public void desconectar() {
		System.out.println("Empty");
	}

	@Override
	public void conectar() {	
		System.out.println("Empty");
	}
	
	
}
